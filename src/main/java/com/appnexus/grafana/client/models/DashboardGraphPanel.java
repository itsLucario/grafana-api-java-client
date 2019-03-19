/* Licensed under Apache-2.0 */
package com.appnexus.grafana.client.models;

import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(fluent = true)
public class DashboardGraphPanel extends DashboardPanel {
  DashboardPanelAlert alert;
  DashboardPanelAliasColors aliasColors;
  Boolean bars;
  Integer dashLength;
  Boolean dashes;
  String datasource; //required for alerts
  Integer fill;
  DashboardPanelGridPos gridPos;
  DashboardPanelLegend legend;
  Boolean lines;
  Integer linewidth;
  String nullPointMode;
  Integer paceLength;
  Boolean percentage;
  Integer pointradius;
  Boolean points;
  String renderer;
  //TODO not sure if correct
  List<String> seriesOverrides;
  Boolean stack;
  Boolean steppedLine;
  List<DashboardPanelTarget> targets;
  List<DashboardPanelThreshold> thresholds;
  DashboardPanelTooltip tooltip;
  DashboardPanelXAxis xaxis;
  List<DashboardPanelYAxes> yaxes;
  DashboardPanelYAxis yaxis;
}
