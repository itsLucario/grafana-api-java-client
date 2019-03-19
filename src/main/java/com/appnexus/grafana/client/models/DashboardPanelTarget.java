/* Licensed under Apache-2.0 */
package com.appnexus.grafana.client.models;

import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
public class DashboardPanelTarget {
  String alias;
  List<String> groupBy;
  Boolean hide;
  String measurement;
  String orderByTime;
  String policy;
  String query;
  Boolean rawQuery;
  String refId;
  String resultFormat;
  List<List<DashboardPanelTargetSelect>> select;
  List<String> tags;
}
