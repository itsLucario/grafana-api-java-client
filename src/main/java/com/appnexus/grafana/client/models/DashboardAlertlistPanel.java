/* Licensed under Apache-2.0 */
package com.appnexus.grafana.client.models;

import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(fluent = true)
public class DashboardAlertlistPanel extends DashboardPanel {
  String dashboardFilter;
  List<String> dashboardTags;
  Integer folderId;
  Integer limit;
  String nameFilter;
  Boolean onlyAlertsOnDashboard;
  String show;
  Integer sortOrder;
  List<String> stateFilter;
}
