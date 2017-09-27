package com.spike.blueprint.infraestructure.api;

import java.util.function.BiConsumer;

import com.spike.blueprint.application.services.ContentManagementService;

import io.vertx.blueprint.microservice.common.RestAPIVerticle;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.http.HttpServer;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.BodyHandler;
import java.util.Optional;

public class RestContentAPIVerticle extends RestAPIVerticle {
	
	
	
	private final ContentManagementService contentManagementService;
	
	private static final String SERVICE_NAME = "content-rest-api";
	private static final String API_CHANNELS = "/channels";
	private static final String API_EVENTS = "/events";

	
	public RestContentAPIVerticle(ContentManagementService contentManagementService) {
	    this.contentManagementService = contentManagementService;
	}
	
	
	public void start(Future<Void> future) throws Exception {
		final Router router = Router.router(vertx);
		router.route().handler(BodyHandler.create());
		router.get(API_CHANNELS).handler( this::apiChannels );
		router.get(API_EVENTS).handler( this::apiEvents );

	    String host = config().getString("shopping.cart.http.address", "0.0.0.0");
	    int port = config().getInteger("shopping.cart.http.port", 8084);

	    // create http server for the REST service
	    createHttpServer(router, host, port)
	      .compose(serverCreated -> publishHttpEndpoint(SERVICE_NAME, host, port))
	      .setHandler(future.completer());
	}

	private void apiChannels(RoutingContext context) {
		String countryId = Optional.ofNullable(context.request().getHeader("countryId")).orElse("DEFAULT");
		contentManagementService.getChannels(countryId, resultHandler(context));
		
	}

	private void apiEvents(RoutingContext context) {
		String countryId = Optional.ofNullable(context.request().getHeader("countryId")).orElse("DEFAULT");
		contentManagementService.getChannels(countryId, resultHandler(context));
	}

}
