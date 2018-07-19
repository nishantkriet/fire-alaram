package com.nishant.firealaram.entity;

import javax.persistence.*;

@Entity
@Table(name = "corporation_alaram_mapping")
public class CorporationAlaramMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String alaramId;
    private int corporationId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlaramId() {
        return alaramId;
    }

    public void setAlaramId(String alaramId) {
        this.alaramId = alaramId;
    }

    public int getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(int corporationId) {
        this.corporationId = corporationId;
    }
}
