/* Licensed under Apache-2.0 */
package com.appnexus.grafana.client.models;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
public class DashboardAnnotationList {
  Integer builtIn;
  String datasource;
  Boolean enable;
  Boolean hide;
  String iconColor;
  String name;
  String type;
}
