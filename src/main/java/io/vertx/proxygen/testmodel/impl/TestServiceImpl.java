/*
 * Copyright 2014 Red Hat, Inc.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Apache License v2.0 which accompanies this distribution.
 *
 *  The Eclipse Public License is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  The Apache License v2.0 is available at
 *  http://www.opensource.org/licenses/apache2.0.php
 *
 *  You may elect to redistribute this code under either of these licenses.
 */

package io.vertx.proxygen.testmodel.impl;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;
import io.vertx.proxygen.testmodel.TestService;

/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class TestServiceImpl implements TestService{


  @Override
  public void foo(String bar, int wibble, JsonObject coll, Handler<AsyncResult<JsonObject>> resHandler) {

  }

  @Override
  public void foo2(String bar, int wibble, JsonObject coll, Handler<AsyncResult<Integer>> resHandler) {

  }

  @Override
  public void bar(String bar, int wibble, JsonObject coll) {

  }

  @Override
  public TestService wibble(String bar, int wibble, JsonObject coll, Handler<AsyncResult<JsonObject>> resHandler) {
    return null;
  }
}
