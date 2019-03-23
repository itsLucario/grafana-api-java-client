/* Licensed under Apache-2.0 */
package com.appnexus.grafana.client.models;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.EXISTING_PROPERTY,
  property = "type",
  visible = true
)
@JsonSubTypes({
  @JsonSubTypes.Type(value = DashboardGraphPanel.class, name = "graph"),
  @JsonSubTypes.Type(value = DashboardAlertlistPanel.class, name = "alertlist")
})
@Data
@Accessors(fluent = true)
public abstract class DashboardPanel {
  DashboardPanelGridPos gridPos;
  Integer id;
  List<DashboardPanelLink> links;
  String timeFrom;
  List<String> timeRegions;
  String timeShift;
  String title;
  Type type;

  public enum Type {
    GRAPH("graph"),
    ALERTLIST("alertlist");

    private final String value;

    Type(String s) {
      value = s;
    }

    @JsonValue
    public String value() {
      return value;
    }
  }
}
