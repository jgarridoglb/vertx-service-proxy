package com.spike.blueprint.infraestructure.launcher;

import com.spike.blueprint.application.services.ContentManagementService;
import com.spike.blueprint.application.services.impl.ContentManagementServiceImpl;
import com.spike.blueprint.infraestructure.api.RestContentAPIVerticle;

import io.vertx.blueprint.microservice.common.BaseMicroserviceVerticle;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Future;
import io.vertx.serviceproxy.ProxyHelper;

public class ContentVerticle extends BaseMicroserviceVerticle {
	
	private ContentManagementService contentManagementService; 
	  @Override
	  public void start(Future<Void> future) throws Exception {
		    super.start();

		    // create the service instance
		    this.contentManagementService = new ContentManagementServiceImpl(vertx, discovery, config());

		    // register the service proxy on event bus
		    ProxyHelper.registerService(ContentManagementService.class, vertx, contentManagementService, ContentManagementService.SERVICE_ADDRESS);
	

		    // publish the service in the discovery infrastructure
		    publishEventBusService(ContentManagementService.SERVICE_NAME, ContentManagementService.SERVICE_ADDRESS, ContentManagementService.class)
		      .compose(sourcePublished -> deployRestVerticle())
		      .setHandler(future.completer());
	  }



	  private Future<Void> deployRestVerticle() {
		    Future<String> future = Future.future();
		    vertx.deployVerticle(new RestContentAPIVerticle(contentManagementService),
		      new DeploymentOptions().setConfig(config()),
		      future.completer());
		    return future.map(r -> null);
	}
}
