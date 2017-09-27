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

/** @module vertx-blueprint-content-js/content_management_service */
var utils = require('vertx-js/util/utils');

var io = Packages.io;
var JsonObject = io.vertx.core.json.JsonObject;
var JContentManagementService = Java.type('com.spike.blueprint.application.services.ContentManagementService');
var ContentModel = Java.type('com.spike.blueprint.domain.entities.ContentModel');

/**
 @class
*/
var ContentManagementService = function(j_val) {

  var j_contentManagementService = j_val;
  var that = this;

  /**

   @public
   @param country {string} 
   @param resultHandler {function} 
   @return {ContentManagementService}
   */
  this.getChannels = function(country, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_contentManagementService["getChannels(java.lang.String,io.vertx.core.Handler)"](country, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param country {string} 
   @param resultHandler {function} 
   @return {ContentManagementService}
   */
  this.getEvents = function(country, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_contentManagementService["getEvents(java.lang.String,io.vertx.core.Handler)"](country, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param competitionId {string} 
   @param resultHandler {function} 
   @return {ContentManagementService}
   */
  this.getCompetitionId = function(competitionId, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_contentManagementService["getCompetitionId(java.lang.String,io.vertx.core.Handler)"](competitionId, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param streams {string} 
   @param resultHandler {function} 
   @return {ContentManagementService}
   */
  this.getStreams = function(streams, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_contentManagementService["getStreams(java.lang.String,io.vertx.core.Handler)"](streams, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_contentManagementService;
};

ContentManagementService._jclass = utils.getJavaClass("com.spike.blueprint.application.services.ContentManagementService");
ContentManagementService._jtype = {
  accept: function(obj) {
    return ContentManagementService._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(ContentManagementService.prototype, {});
    ContentManagementService.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
ContentManagementService._create = function(jdel) {
  var obj = Object.create(ContentManagementService.prototype, {});
  ContentManagementService.apply(obj, arguments);
  return obj;
}
module.exports = ContentManagementService;