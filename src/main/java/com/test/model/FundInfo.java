package com.test.model;

public class FundInfo {
    private Integer id;

    private String name;

    private String code;

    private Double unit_price;

    private Double share;

    private Double sell_rate;

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

    public Double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(Double unit_price) {
        this.unit_price = unit_price;
    }

    public Double getShare() {
        return share;
    }

    public void setShare(Double share) {
        this.share = share;
    }

    public Double getSell_rate() {
        return sell_rate;
    }

    public void setSell_rate(Double sell_rate) {
        this.sell_rate = sell_rate;
    }
}