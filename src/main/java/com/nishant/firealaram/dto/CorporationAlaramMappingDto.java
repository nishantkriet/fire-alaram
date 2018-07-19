package com.nishant.firealaram.dto;

public class CorporationAlaramMappingDto {

    private String corporationName;
    private String alaramId;

    public String getCorporationName() {
        return corporationName;
    }

    public void setCorporationName(String corporationName) {
        this.corporationName = corporationName;
    }

    public String getAlaramId() {
        return alaramId;
    }

    public void setAlaramId(String alaramId) {
        this.alaramId = alaramId;
    }
}
