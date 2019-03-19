/* Licensed under Apache-2.0 */
package com.appnexus.grafana.client.models;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
public class Datasource {
  Integer id;
  Integer orgId;
  String name;
  String type;
  String typeLogoUrl;
  String access;
  String url;
  String password;
  String user;
  String database;
  Boolean basicAuth;
  Boolean isDefault;
  DatasourceJsonData jsonData;
  Boolean readOnly;
  
  public enum Type {
	    INFLUXDB("influxdb"),
	    TESTDATA("testdata");

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
