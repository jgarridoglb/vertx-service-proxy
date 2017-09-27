package com.spike.blueprint.infraestructure.persistence;

import java.util.ArrayList;
import java.util.List;

import com.spike.blueprint.domain.entities.ContentModel;
import com.spike.blueprint.domain.entities.Hit;
import com.spike.blueprint.domain.repositories.ContentManagementRepository;


import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;



public class ContentManagementRepositoryImpl implements ContentManagementRepository {

	public ContentManagementRepositoryImpl(io.vertx.core.Vertx vertx, JsonObject json) {

	}

	@Override
	public void findChannelsByCountry(String country, Handler<AsyncResult<ContentModel>> resultHandler) {
		List<Hit> hits = new ArrayList<Hit>();
		  
		Hit hit = new Hit();
		  
		  hit.setCode(1);
		  hit.setName("Jorge");
		  
		  hits.add( hit );
		  
		  hit = new Hit();
		  
		  hit.setCode(2);
		  hit.setName("Mary");
		  
		  hits.add( hit );
		  
		  ContentModel contentModel = new ContentModel(null);
		  contentModel.setHits(hits);
		  
		  resultHandler.handle(Future.succeededFuture(contentModel));  
	
	}

	@Override
	public void findEventsByCountry(String country, Handler<AsyncResult<ContentModel>> resultHandler) {
		
		List<Hit> hits = new ArrayList<Hit>();
		  
		Hit hit = new Hit();
		  
		  hit.setCode(1);
		  hit.setName("Jorge");
		  
		  hits.add( hit );
		  
		  hit = new Hit();
		  
		  hit.setCode(2);
		  hit.setName("Mary");
		  
		  hits.add( hit );
		  
		  ContentModel contentModel = new ContentModel(null);
		  contentModel.setHits(hits);
		  
		  resultHandler.handle(Future.succeededFuture(contentModel));  
		
	}

	@Override
	public void findEventsByCompetition(String competitionId, Handler<AsyncResult<ContentModel>> resultHandler) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findStreams(String streams, Handler<AsyncResult<ContentModel>> resultHandler) {
		// TODO Auto-generated method stub
		
	}


}
