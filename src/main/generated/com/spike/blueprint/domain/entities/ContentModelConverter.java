/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.spike.blueprint.domain.entities;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;

/**
 * Converter for {@link com.spike.blueprint.domain.entities.ContentModel}.
 *
 * NOTE: This class has been automatically generated from the {@link com.spike.blueprint.domain.entities.ContentModel} original class using Vert.x codegen.
 */
public class ContentModelConverter {

  public static void fromJson(JsonObject json, ContentModel obj) {
    if (json.getValue("errorMessage") instanceof String) {
      obj.setErrorMessage((String)json.getValue("errorMessage"));
    }
    if (json.getValue("responseWithError") instanceof Boolean) {
      obj.setResponseWithError((Boolean)json.getValue("responseWithError"));
    }
  }

  public static void toJson(ContentModel obj, JsonObject json) {
    if (obj.getErrorMessage() != null) {
      json.put("errorMessage", obj.getErrorMessage());
    }
    json.put("responseWithError", obj.isResponseWithError());
  }
}