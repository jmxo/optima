package com.ismat.organization.events.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrganizationChangeModel {
    private String type;
    private String action;
    private String organizationId;

    public OrganizationChangeModel(String type, String action, String organizationId) {
        super();
        this.type = type;
        this.action = action;
        this.organizationId = organizationId;
    }
}
