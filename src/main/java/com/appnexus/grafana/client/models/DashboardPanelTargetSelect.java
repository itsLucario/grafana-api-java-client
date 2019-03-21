/* Licensed under Apache-2.0 */
package com.appnexus.grafana.client.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
public class DashboardPanelTargetSelect {
  List<String> params;
  Type type;
  
	public enum Type {
		FIELD("field"),
		BOTTOM("bottom"),
		FIRST("first"),
		LAST("last"),
		MAX("max"),
		MIN("min"),
		PERCENTILE("percentile"),
		TOP("top"),
		COUNT("count"),
		DISTINCT("distinct"),
		INTEGRAL("integral"),
		MEAN("mean"),
		MEDIAN("median"),
		MODE("mode"),
		SUM("sum"),
		MATH("math"),
		ALIAS("alias"),
		HOLT_WINTERS("holt_winters"),
		HOLT_WINTERS_WITH_FIT("holt_winters_with_fit"),
		DERIVATIVE("derivative"),
		SPREAD("spread"),
		NON_NEGATIVE_DERIVATIVE("non_negative_derivative"),
		DIFFERENCE("difference"),
		NON_NEGATIVE_DIFFERENCE("non_negative_difference"),
		MOVING_AVERAGE("moving_average"),
		CUMULATIVE_SUM("cumulative_sum"),
		STDDEV("stddev"),
		ELAPSED("elapsed");
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
