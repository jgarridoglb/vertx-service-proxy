package com.spike.blueprint.domain.entities;

import java.util.List;


import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

@DataObject(generateConverter = true)
public class ContentModel {
	
	protected List<Hit> hits;
	protected JsonObject contentResponse;
	private boolean responseWithError;
	private String errorMessage;
	
	public List<Hit> getHits() {
		return hits;
	}

	public void setHits(List<Hit> hits) {
		this.hits = hits;
	}
	

	public boolean isResponseWithError() {
		return responseWithError;
	}

	public void setResponseWithError(boolean responseWithError) {
		this.responseWithError = responseWithError;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public ContentModel(JsonObject contentResponse){
		this.contentResponse = contentResponse;
	}
	
	public JsonObject toJson(){
		return JsonObject.mapFrom(this);
	}
	
	  @Override
	  public String toString() {
	    return this.toJson().encode();
	  }
	
	protected enum JsonFields {
		HITS_OBJECT("hits"),
		HITS_ARRAY("hits"),
		INNER_HITS("inner_hits"),
		SOURCE("_source"),
		CODE("code"),
		GROUPS("groups"),
		FIELDS("fields"),
		NAME("name");
		private String fieldName;
		private JsonFields(String fieldName) {
			this.fieldName = fieldName;
		}
		
		String getFieldName(){
			return fieldName;
		}
	}

}
