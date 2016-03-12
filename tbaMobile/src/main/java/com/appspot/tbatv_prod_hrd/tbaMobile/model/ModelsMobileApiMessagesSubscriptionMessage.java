/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-02-18 22:11:37 UTC)
 * on 2016-02-26 at 01:07:31 UTC 
 * Modify at your own risk.
 */

package com.appspot.tbatv_prod_hrd.tbaMobile.model;

/**
 * Model definition for ModelsMobileApiMessagesSubscriptionMessage.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the tbaMobile. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
@Deprecated
public final class ModelsMobileApiMessagesSubscriptionMessage extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("device_key")
  private java.lang.String deviceKey;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("model_key")
  private java.lang.String modelKey;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("model_type") @com.google.api.client.json.JsonString
  private java.lang.Long modelType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> notifications;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDeviceKey() {
    return deviceKey;
  }

  /**
   * @param deviceKey deviceKey or {@code null} for none
   */
  public ModelsMobileApiMessagesSubscriptionMessage setDeviceKey(java.lang.String deviceKey) {
    this.deviceKey = deviceKey;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getModelKey() {
    return modelKey;
  }

  /**
   * @param modelKey modelKey or {@code null} for none
   */
  public ModelsMobileApiMessagesSubscriptionMessage setModelKey(java.lang.String modelKey) {
    this.modelKey = modelKey;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getModelType() {
    return modelType;
  }

  /**
   * @param modelType modelType or {@code null} for none
   */
  public ModelsMobileApiMessagesSubscriptionMessage setModelType(java.lang.Long modelType) {
    this.modelType = modelType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getNotifications() {
    return notifications;
  }

  /**
   * @param notifications notifications or {@code null} for none
   */
  public ModelsMobileApiMessagesSubscriptionMessage setNotifications(java.util.List<java.lang.String> notifications) {
    this.notifications = notifications;
    return this;
  }

  @Override
  public ModelsMobileApiMessagesSubscriptionMessage set(String fieldName, Object value) {
    return (ModelsMobileApiMessagesSubscriptionMessage) super.set(fieldName, value);
  }

  @Override
  public ModelsMobileApiMessagesSubscriptionMessage clone() {
    return (ModelsMobileApiMessagesSubscriptionMessage) super.clone();
  }

}
