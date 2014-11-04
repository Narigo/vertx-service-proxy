/*
* Copyright 2014 Red Hat, Inc.
*
* Red Hat licenses this file to you under the Apache License, version 2.0
* (the "License"); you may not use this file except in compliance with the
* License. You may obtain a copy of the License at:
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
* WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
* License for the specific language governing permissions and limitations
* under the License.
*/

package io.vertx.proxygen.testmodel;

import io.vertx.proxygen.testmodel.TestService;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.core.Vertx;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import java.util.List;
import java.util.ArrayList;
import io.vertx.proxygen.testmodel.SomeEnum;
import io.vertx.proxygen.testmodel.TestService;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonArray;
import java.util.List;
import io.vertx.proxygen.testmodel.TestOptions;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

/*
  Generated Proxy code - DO NOT EDIT
  @author Roger the Robot
*/
public class TestServiceVertxEBProxy implements TestService {

  private Vertx _vertx;
  private String _address;

  public TestServiceVertxEBProxy(Vertx vertx, String address) {
    this._vertx = vertx;
    this._address = address;
  }

  public void noParams() {
    JsonObject _json = new JsonObject();
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "noParams");
    _vertx.eventBus().send(_address, _json, _deliveryOptions);
  }

  public void basicTypes(String str, byte b, short s, int i, long l, float f, double d, char c, boolean bool) {
    JsonObject _json = new JsonObject();
    _json.put("str", str);
    _json.put("b", b);
    _json.put("s", s);
    _json.put("i", i);
    _json.put("l", l);
    _json.put("f", f);
    _json.put("d", d);
    _json.put("c", (int)c);
    _json.put("bool", bool);
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "basicTypes");
    _vertx.eventBus().send(_address, _json, _deliveryOptions);
  }

  public void basicBoxedTypes(String str, Byte b, Short s, Integer i, Long l, Float f, Double d, Character c, Boolean bool) {
    JsonObject _json = new JsonObject();
    _json.put("str", str);
    _json.put("b", b);
    _json.put("s", s);
    _json.put("i", i);
    _json.put("l", l);
    _json.put("f", f);
    _json.put("d", d);
    _json.put("c", (int)c);
    _json.put("bool", bool);
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "basicBoxedTypes");
    _vertx.eventBus().send(_address, _json, _deliveryOptions);
  }

  public void jsonTypes(JsonObject jsonObject, JsonArray jsonArray) {
    JsonObject _json = new JsonObject();
    _json.put("jsonObject", jsonObject);
    _json.put("jsonArray", jsonArray);
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "jsonTypes");
    _vertx.eventBus().send(_address, _json, _deliveryOptions);
  }

  public void enumType(SomeEnum someEnum) {
    JsonObject _json = new JsonObject();
    _json.put("someEnum", someEnum.toString());
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "enumType");
    _vertx.eventBus().send(_address, _json, _deliveryOptions);
  }

  public void optionType(TestOptions options) {
    JsonObject _json = new JsonObject();
    _json.put("options", options.toJson());
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "optionType");
    _vertx.eventBus().send(_address, _json, _deliveryOptions);
  }

  public void stringHandler(Handler<AsyncResult<String>> resultHandler) {
    JsonObject _json = new JsonObject();
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "stringHandler");
    _vertx.eventBus().<String>send(_address, _json, _deliveryOptions, res -> {
      if (res.failed()) {
        resultHandler.handle(Future.completedFuture(res.cause()));
      } else {
        resultHandler.handle(Future.completedFuture(res.result().body()));
      }
    });
  }

  public void byteHandler(Handler<AsyncResult<Byte>> resultHandler) {
    JsonObject _json = new JsonObject();
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "byteHandler");
    _vertx.eventBus().<Byte>send(_address, _json, _deliveryOptions, res -> {
      if (res.failed()) {
        resultHandler.handle(Future.completedFuture(res.cause()));
      } else {
        resultHandler.handle(Future.completedFuture(res.result().body()));
      }
    });
  }

  public void shortHandler(Handler<AsyncResult<Short>> resultHandler) {
    JsonObject _json = new JsonObject();
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "shortHandler");
    _vertx.eventBus().<Short>send(_address, _json, _deliveryOptions, res -> {
      if (res.failed()) {
        resultHandler.handle(Future.completedFuture(res.cause()));
      } else {
        resultHandler.handle(Future.completedFuture(res.result().body()));
      }
    });
  }

  public void intHandler(Handler<AsyncResult<Integer>> resultHandler) {
    JsonObject _json = new JsonObject();
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "intHandler");
    _vertx.eventBus().<Integer>send(_address, _json, _deliveryOptions, res -> {
      if (res.failed()) {
        resultHandler.handle(Future.completedFuture(res.cause()));
      } else {
        resultHandler.handle(Future.completedFuture(res.result().body()));
      }
    });
  }

  public void longHandler(Handler<AsyncResult<Long>> resultHandler) {
    JsonObject _json = new JsonObject();
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "longHandler");
    _vertx.eventBus().<Long>send(_address, _json, _deliveryOptions, res -> {
      if (res.failed()) {
        resultHandler.handle(Future.completedFuture(res.cause()));
      } else {
        resultHandler.handle(Future.completedFuture(res.result().body()));
      }
    });
  }

  public void floatHandler(Handler<AsyncResult<Float>> resultHandler) {
    JsonObject _json = new JsonObject();
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "floatHandler");
    _vertx.eventBus().<Float>send(_address, _json, _deliveryOptions, res -> {
      if (res.failed()) {
        resultHandler.handle(Future.completedFuture(res.cause()));
      } else {
        resultHandler.handle(Future.completedFuture(res.result().body()));
      }
    });
  }

  public void doubleHandler(Handler<AsyncResult<Double>> resultHandler) {
    JsonObject _json = new JsonObject();
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "doubleHandler");
    _vertx.eventBus().<Double>send(_address, _json, _deliveryOptions, res -> {
      if (res.failed()) {
        resultHandler.handle(Future.completedFuture(res.cause()));
      } else {
        resultHandler.handle(Future.completedFuture(res.result().body()));
      }
    });
  }

  public void charHandler(Handler<AsyncResult<Character>> resultHandler) {
    JsonObject _json = new JsonObject();
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "charHandler");
    _vertx.eventBus().<Character>send(_address, _json, _deliveryOptions, res -> {
      if (res.failed()) {
        resultHandler.handle(Future.completedFuture(res.cause()));
      } else {
        resultHandler.handle(Future.completedFuture(res.result().body()));
      }
    });
  }

  public void booleanHandler(Handler<AsyncResult<Boolean>> resultHandler) {
    JsonObject _json = new JsonObject();
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "booleanHandler");
    _vertx.eventBus().<Boolean>send(_address, _json, _deliveryOptions, res -> {
      if (res.failed()) {
        resultHandler.handle(Future.completedFuture(res.cause()));
      } else {
        resultHandler.handle(Future.completedFuture(res.result().body()));
      }
    });
  }

  public void jsonObjectHandler(Handler<AsyncResult<JsonObject>> resultHandler) {
    JsonObject _json = new JsonObject();
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "jsonObjectHandler");
    _vertx.eventBus().<JsonObject>send(_address, _json, _deliveryOptions, res -> {
      if (res.failed()) {
        resultHandler.handle(Future.completedFuture(res.cause()));
      } else {
        resultHandler.handle(Future.completedFuture(res.result().body()));
      }
    });
  }

  public void jsonArrayHandler(Handler<AsyncResult<JsonArray>> resultHandler) {
    JsonObject _json = new JsonObject();
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "jsonArrayHandler");
    _vertx.eventBus().<JsonArray>send(_address, _json, _deliveryOptions, res -> {
      if (res.failed()) {
        resultHandler.handle(Future.completedFuture(res.cause()));
      } else {
        resultHandler.handle(Future.completedFuture(res.result().body()));
      }
    });
  }

  public void voidHandler(Handler<AsyncResult<Void>> resultHandler) {
    JsonObject _json = new JsonObject();
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "voidHandler");
    _vertx.eventBus().<Void>send(_address, _json, _deliveryOptions, res -> {
      if (res.failed()) {
        resultHandler.handle(Future.completedFuture(res.cause()));
      } else {
        resultHandler.handle(Future.completedFuture(res.result().body()));
      }
    });
  }

  public TestService fluentMethod(String str, Handler<AsyncResult<String>> resultHandler) {
    JsonObject _json = new JsonObject();
    _json.put("str", str);
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "fluentMethod");
    _vertx.eventBus().<String>send(_address, _json, _deliveryOptions, res -> {
      if (res.failed()) {
        resultHandler.handle(Future.completedFuture(res.cause()));
      } else {
        resultHandler.handle(Future.completedFuture(res.result().body()));
      }
    });
    return this;
  }

  public TestService fluentNoParams() {
    JsonObject _json = new JsonObject();
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "fluentNoParams");
    _vertx.eventBus().send(_address, _json, _deliveryOptions);
    return this;
  }

  public void failingMethod(Handler<AsyncResult<JsonObject>> resultHandler) {
    JsonObject _json = new JsonObject();
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "failingMethod");
    _vertx.eventBus().<JsonObject>send(_address, _json, _deliveryOptions, res -> {
      if (res.failed()) {
        resultHandler.handle(Future.completedFuture(res.cause()));
      } else {
        resultHandler.handle(Future.completedFuture(res.result().body()));
      }
    });
  }

  public void invokeWithMessage(JsonObject object, String str, int i, char chr, SomeEnum senum, Handler<AsyncResult<String>> resultHandler) {
    JsonObject _json = new JsonObject();
    _json.put("object", object);
    _json.put("str", str);
    _json.put("i", i);
    _json.put("chr", (int)chr);
    _json.put("senum", senum.toString());
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "invokeWithMessage");
    _vertx.eventBus().<String>send(_address, _json, _deliveryOptions, res -> {
      if (res.failed()) {
        resultHandler.handle(Future.completedFuture(res.cause()));
      } else {
        resultHandler.handle(Future.completedFuture(res.result().body()));
      }
    });
  }

  public void listStringHandler(Handler<AsyncResult<List<String>>> resultHandler) {
    JsonObject _json = new JsonObject();
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "listStringHandler");
    _vertx.eventBus().<JsonArray>send(_address, _json, _deliveryOptions, res -> {
      if (res.failed()) {
        resultHandler.handle(Future.completedFuture(res.cause()));
      } else {
        resultHandler.handle(Future.completedFuture(res.result().body().getList()));
      }
    });
  }

  public void listByteHandler(Handler<AsyncResult<List<Byte>>> resultHandler) {
    JsonObject _json = new JsonObject();
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "listByteHandler");
    _vertx.eventBus().<JsonArray>send(_address, _json, _deliveryOptions, res -> {
      if (res.failed()) {
        resultHandler.handle(Future.completedFuture(res.cause()));
      } else {
        resultHandler.handle(Future.completedFuture(res.result().body().getList()));
      }
    });
  }

  public void listShortHandler(Handler<AsyncResult<List<Short>>> resultHandler) {
    JsonObject _json = new JsonObject();
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "listShortHandler");
    _vertx.eventBus().<JsonArray>send(_address, _json, _deliveryOptions, res -> {
      if (res.failed()) {
        resultHandler.handle(Future.completedFuture(res.cause()));
      } else {
        resultHandler.handle(Future.completedFuture(res.result().body().getList()));
      }
    });
  }

  public void listIntHandler(Handler<AsyncResult<List<Integer>>> resultHandler) {
    JsonObject _json = new JsonObject();
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "listIntHandler");
    _vertx.eventBus().<JsonArray>send(_address, _json, _deliveryOptions, res -> {
      if (res.failed()) {
        resultHandler.handle(Future.completedFuture(res.cause()));
      } else {
        resultHandler.handle(Future.completedFuture(res.result().body().getList()));
      }
    });
  }

  public void listLongHandler(Handler<AsyncResult<List<Long>>> resultHandler) {
    JsonObject _json = new JsonObject();
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "listLongHandler");
    _vertx.eventBus().<JsonArray>send(_address, _json, _deliveryOptions, res -> {
      if (res.failed()) {
        resultHandler.handle(Future.completedFuture(res.cause()));
      } else {
        resultHandler.handle(Future.completedFuture(res.result().body().getList()));
      }
    });
  }

  public void listFloatHandler(Handler<AsyncResult<List<Float>>> resultHandler) {
    JsonObject _json = new JsonObject();
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "listFloatHandler");
    _vertx.eventBus().<JsonArray>send(_address, _json, _deliveryOptions, res -> {
      if (res.failed()) {
        resultHandler.handle(Future.completedFuture(res.cause()));
      } else {
        resultHandler.handle(Future.completedFuture(res.result().body().getList()));
      }
    });
  }

  public void listDoubleHandler(Handler<AsyncResult<List<Double>>> resultHandler) {
    JsonObject _json = new JsonObject();
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "listDoubleHandler");
    _vertx.eventBus().<JsonArray>send(_address, _json, _deliveryOptions, res -> {
      if (res.failed()) {
        resultHandler.handle(Future.completedFuture(res.cause()));
      } else {
        resultHandler.handle(Future.completedFuture(res.result().body().getList()));
      }
    });
  }

  public void listCharHandler(Handler<AsyncResult<List<Character>>> resultHandler) {
    JsonObject _json = new JsonObject();
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "listCharHandler");
    _vertx.eventBus().<JsonArray>send(_address, _json, _deliveryOptions, res -> {
      if (res.failed()) {
        resultHandler.handle(Future.completedFuture(res.cause()));
      } else {
        resultHandler.handle(Future.completedFuture(convertToListChar(res.result().body())));
      }
    });
  }

  public void listBoolHandler(Handler<AsyncResult<List<Boolean>>> resultHandler) {
    JsonObject _json = new JsonObject();
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "listBoolHandler");
    _vertx.eventBus().<JsonArray>send(_address, _json, _deliveryOptions, res -> {
      if (res.failed()) {
        resultHandler.handle(Future.completedFuture(res.cause()));
      } else {
        resultHandler.handle(Future.completedFuture(res.result().body().getList()));
      }
    });
  }

  public void listJsonObjectHandler(Handler<AsyncResult<List<JsonObject>>> resultHandler) {
    JsonObject _json = new JsonObject();
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "listJsonObjectHandler");
    _vertx.eventBus().<JsonArray>send(_address, _json, _deliveryOptions, res -> {
      if (res.failed()) {
        resultHandler.handle(Future.completedFuture(res.cause()));
      } else {
        resultHandler.handle(Future.completedFuture(convertToListJsonObject(res.result().body())));
      }
    });
  }

  public void listJsonArrayHandler(Handler<AsyncResult<List<JsonArray>>> resultHandler) {
    JsonObject _json = new JsonObject();
    DeliveryOptions _deliveryOptions = new DeliveryOptions();
    _deliveryOptions.addHeader("action", "listJsonArrayHandler");
    _vertx.eventBus().<JsonArray>send(_address, _json, _deliveryOptions, res -> {
      if (res.failed()) {
        resultHandler.handle(Future.completedFuture(res.cause()));
      } else {
        resultHandler.handle(Future.completedFuture(convertToListJsonArray(res.result().body())));
      }
    });
  }

  public void ignoredMethod() {
  }


  // This is clunky, but will disappear once we refactor JsonObject to be a map
  private List<JsonObject> convertToListJsonObject(JsonArray arr) {
    List<JsonObject> list = new ArrayList<>();
    for (Object obj: arr) {
      JsonObject jobj = (JsonObject)obj;
      list.add(jobj);
    }
    return list;
  }
  // This is clunky, but will disappear once we refactor Json stuff
  private List<JsonArray> convertToListJsonArray(JsonArray arr) {
    List<JsonArray> list = new ArrayList<>();
    for (Object obj: arr) {
      JsonArray jobj = (JsonArray)obj;
      list.add(jobj);
    }
    return list;
  }
  private List<Character> convertToListChar(JsonArray arr) {
    List<Character> list = new ArrayList<>();
    for (Object obj: arr) {
      Integer jobj = (Integer)obj;
      list.add((char)jobj.intValue());
    }
    return list;
  }
}