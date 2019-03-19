/* Licensed under Apache-2.0 */
package com.appnexus.grafana.client.models;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
public class DashboardMeta {
  String type;
  Boolean canSave;
  Boolean canEdit;
  Boolean canAdmin;
  Boolean canStar;
  String slug;
  String url;
  String expires;
  String created;
  String updated;
  String updatedBy;
  String createdBy;
  Integer version;
  Boolean hasAcl;
  Boolean isFolder;
  Integer folderId;
  String folderTitle;
  String folderUrl;
  Boolean provisioned;
}
