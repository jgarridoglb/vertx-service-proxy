package com.spike.blueprint.application.services.impl;

import com.spike.blueprint.application.services.ContentManagementService;
import com.spike.blueprint.domain.entities.ContentModel;
import com.spike.blueprint.domain.repositories.ContentManagementRepository;
import com.spike.blueprint.infraestructure.persistence.ContentManagementRepositoryImpl;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.servicediscovery.ServiceDiscovery;

public class ContentManagementServiceImpl implements ContentManagementService{
	
	private ContentManagementRepository contentManagementRepository;
	private final ServiceDiscovery discovery;
	
	public ContentManagementServiceImpl(Vertx vertx, ServiceDiscovery discovery, JsonObject config) {
		this.discovery = discovery;
		this.contentManagementRepository = new ContentManagementRepositoryImpl(vertx, config);
	}

	@Override
	public ContentManagementService getChannels(String country, Handler<AsyncResult<ContentModel>> resultHandler) {
		this.contentManagementRepository.findChannelsByCountry(country,res->{
		        if (res.succeeded()) {
		          if (res.result() == null) {
		            resultHandler.handle(Future.failedFuture(res.cause()));
		          } else {
		            resultHandler.handle(Future.succeededFuture(res.result()));
		          }
		        } else {
		          resultHandler.handle(Future.failedFuture(res.cause()));
		        }
		});
		return this;
	}

	@Override
	public ContentManagementService getEvents(String country, Handler<AsyncResult<ContentModel>> resultHandler) {
		this.contentManagementRepository.findEventsByCountry(country,res->{
	        if (res.succeeded()) {
	          if (res.result() == null) {
	            resultHandler.handle(Future.failedFuture(res.cause()));
	          } else {
	            resultHandler.handle(Future.succeededFuture(res.result()));
	          }
	        } else {
	          resultHandler.handle(Future.failedFuture(res.cause()));
	        }
	});
	return this;
	}

	@Override
	public ContentManagementService getCompetitionId(String competitionId,
			Handler<AsyncResult<ContentModel>> resultHandler) {
		this.contentManagementRepository.findEventsByCompetition(competitionId,res->{
	        if (res.succeeded()) {
	          if (res.result() == null) {
	            resultHandler.handle(Future.failedFuture(res.cause()));
	          } else {
	            resultHandler.handle(Future.succeededFuture(res.result()));
	          }
	        } else {
	          resultHandler.handle(Future.failedFuture(res.cause()));
	        }
	});
	return this;
	}

	@Override
	public ContentManagementService getStreams(String streams, Handler<AsyncResult<ContentModel>> resultHandler) {

		this.contentManagementRepository.findStreams(streams,res->{
	        if (res.succeeded()) {
	          if (res.result() == null) {
	            resultHandler.handle(Future.failedFuture(res.cause()));
	          } else {
	            resultHandler.handle(Future.succeededFuture(res.result()));
	          }
	        } else {
	          resultHandler.handle(Future.failedFuture(res.cause()));
	        }
	});
	return this;
	}
}
