/* Licensed under Apache-2.0 */
package com.appnexus.grafana.client.models;

import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
public class Dashboard {
  DashboardAnnotation annotations;
  Boolean editable;
  Long gnetId;
  Integer graphTooltip;
  Long id;
  List<String> links;
  List<DashboardPanel> panels;
  String refresh;
  Integer schemaVersion;
  String style;
  List<String> tags;
  DashboardTemplate templating;
  DashboardTime time;
  DashboardTimepicker timepicker;
  String timezone;
  String title;
  String uid;
  Integer version;
}
