package com.deloitte.cmats5.entity;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

public class MerchInfo {

    private Long merch_id;

    @NotNull(message = "商品名称不能为空")
    private String merch_name;

    @NotNull(message = "商品价格不能为空")
    private double merch_price;

    @NotNull(message = "商品数量不能为空")
    private int merch_num;

    public Long getMerch_id() {
        return merch_id;
    }

    public void setMerch_id(Long merch_id) {
        this.merch_id = merch_id;
    }

    public String getMerch_name() {
        return merch_name;
    }

    public void setMerch_name(String merch_name) {
        this.merch_name = merch_name;
    }

    public double getMerch_price() {
        return merch_price;
    }

    public void setMerch_price(double merch_price) {
        this.merch_price = merch_price;
    }

    public int getMerch_num() {
        return merch_num;
    }

    public void setMerch_num(int merch_num) {
        this.merch_num = merch_num;
    }
}
