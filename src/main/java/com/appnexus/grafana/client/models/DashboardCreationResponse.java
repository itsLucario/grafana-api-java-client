/* Licensed under Apache-2.0 */
package com.appnexus.grafana.client.models;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
public class DashboardCreationResponse {
  Integer id;
  String uid;
  String url;
  String status;
  Integer vuersion;
  String slug;
}
