package com.spike.blueprint.domain.entities;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Hit {
	private Integer code;
	private String name;
	private Map<String,Object> fields;
	
	public Hit(){
	}
	
	public Hit(Map<String,Object> fields){
		code = null;
		name = null;
		this.fields = fields;
	}
	
	public Hit(Integer code, Map<String,Object> fields){
		this.fields = fields;
		this.code = code;
		this.name = null;
	}
	
	public Hit(Integer code, String name, Map<String,Object> fields){
		this.fields = fields;
		this.code = code;
		this.name = name;
	}
	
	public Hit(String name){
		this.fields = null;
		this.code = null;
		this.name = name;
	}
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public Map<String,Object> getFields(){
		return fields;
	}
	
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public Integer getCode(){
		return code;
	}
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public String getName(){
		return name;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFields(Map<String, Object> fields) {
		this.fields = fields;
	}
	
	
	
	
}
