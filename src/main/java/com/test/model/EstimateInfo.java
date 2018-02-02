package com.test.model;

import java.util.Date;

public class EstimateInfo {
    private Integer id;

    private String name;

    private String code;

    private Double est_value;

    private Date est_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Double getEst_value() {
        return est_value;
    }

    public void setEst_value(Double est_value) {
        this.est_value = est_value;
    }

    public Date getEst_time() {
        return est_time;
    }

    public void setEst_time(Date est_time) {
        this.est_time = est_time;
    }
}