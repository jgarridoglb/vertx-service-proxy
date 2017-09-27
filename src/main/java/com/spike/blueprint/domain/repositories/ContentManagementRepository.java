package com.spike.blueprint.domain.repositories;

import  com.spike.blueprint.domain.entities.ContentModel;


import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

public interface ContentManagementRepository {
	void findChannelsByCountry(String country,Handler<AsyncResult<ContentModel>> resultHandler);
	void findEventsByCountry(String country,Handler<AsyncResult<ContentModel>> resultHandler);
	void findEventsByCompetition(String competitionId,Handler<AsyncResult<ContentModel>> resultHandler);
	void findStreams(String streams,Handler<AsyncResult<ContentModel>> resultHandler);
}
