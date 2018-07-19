package com.nishant.firealaram.entity;

import javax.persistence.*;

@Entity
@Table(name = "building_alaram_mapping")
public class BuildingAlaramMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int buildingId;
    private String alaramId;
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

    public String getAlaramId() {
        return alaramId;
    }

    public void setAlaramId(String alaramId) {
        this.alaramId = alaramId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
