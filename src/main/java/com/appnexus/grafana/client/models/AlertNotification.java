/* Licensed under Apache-2.0 */
package com.appnexus.grafana.client.models;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
public class AlertNotification {
  Integer id;
  Integer uid;
  String name;
  String type;
  Boolean isDefault;
  Boolean sendReminder;
  Boolean disableResolveMessage;
  String frequency;
  String created;
  String updated;
  AlertNotificationSettings settings;
}
