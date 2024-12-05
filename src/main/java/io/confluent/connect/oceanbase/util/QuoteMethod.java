/*
 * Copyright 2018 Confluent Inc.
 *
 * Licensed under the Confluent Community License (the "License"); you may not use
 * this file except in compliance with the License.  You may obtain a copy of the
 * License at
 *
 * http://www.confluent.io/confluent-community-license
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package io.confluent.connect.oceanbase.util;

public enum QuoteMethod {
  ALWAYS("always"),
  NEVER("never");

  public static QuoteMethod get(String name) {
    for (QuoteMethod method : values()) {
      if (method.toString().equalsIgnoreCase(name)) {
        return method;
      }
    }
    throw new IllegalArgumentException("No matching QuoteMethod found for '" + name + "'");
  }

  private final String name;

  QuoteMethod(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }
}