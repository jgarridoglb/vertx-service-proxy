package com.spike.blueprint.application.services;

import com.spike.blueprint.domain.entities.ContentModel;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@VertxGen(concrete = false)
@ProxyGen
public interface ContentManagementService {
	
	  /**
	   * The name of the event bus service.
	   */
	  String SERVICE_NAME = "content-management-service";

	  /**
	   * The address on which the service is published.
	   */
	  String SERVICE_ADDRESS = "service.content.management";

	  
	  @Fluent
	  ContentManagementService getChannels(String country, Handler<AsyncResult<ContentModel>> resultHandler);

	  
	  @Fluent
	  ContentManagementService getEvents(String country, Handler<AsyncResult<ContentModel>> resultHandler);
	  
	  @Fluent
	  ContentManagementService getCompetitionId(String competitionId, Handler<AsyncResult<ContentModel>> resultHandler);
	  
	  @Fluent
	  ContentManagementService getStreams(String streams, Handler<AsyncResult<ContentModel>> resultHandler);

}
