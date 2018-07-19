package com.nishant.firealaram.entity;

import javax.persistence.*;

@Entity
@Table(name = "corporation")
public class Corporation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "corporation_name")
    private String corporationName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorporationName() {
        return corporationName;
    }

    public void setCorporationName(String corporationName) {
        this.corporationName = corporationName;
    }
}
