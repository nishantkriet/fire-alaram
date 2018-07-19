package com.nishant.firealaram.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "alaram")
public class Alaram {

    @Id
    private String alaramId;
    private String alaramName;
    @CreationTimestamp
    private Date timestamp;
    private Integer severity;

    public String getAlaramId() {
        return alaramId;
    }

    public void setAlaramId(String alaramId) {
        this.alaramId = alaramId;
    }

    public String getAlaramName() {
        return alaramName;
    }

    public void setAlaramName(String alaramName) {
        this.alaramName = alaramName;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getSeverity() {
        return severity;
    }

    public void setSeverity(Integer severity) {
        this.severity = severity;
    }
}
