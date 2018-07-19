package com.nishant.firealaram.entity;

import javax.persistence.*;

@Entity
@Table(name = "coporation_building_mappig")
public class CoporationBuildingMappig {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int buildingId;
    private int corporationId;
    private boolean status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(int buildingId) {
        this.buildingId = buildingId;
    }

    public int getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(int corporationId) {
        this.corporationId = corporationId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
