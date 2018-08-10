package com.deloitte.cmats5.utils;

public class OrderDetail {
    private Long order_id;

    private Long user_id;

    private Integer order_status;

    private Double order_price;

    private Long merch_id;

    private Long order_merch_id;

    private Integer order_merch_num;

    private Double order_merch_price;

    private Integer order_merch_status;

    private String merch_name;

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Integer getOrder_status() {
        return order_status;
    }

    public void setOrder_status(Integer order_status) {
        this.order_status = order_status;
    }

    public Double getOrder_price() {
        return order_price;
    }

    public void setOrder_price(Double order_price) {
        this.order_price = order_price;
    }

    public Long getMerch_id() {
        return merch_id;
    }

    public void setMerch_id(Long merch_id) {
        this.merch_id = merch_id;
    }

    public Long getOrder_merch_id() {
        return order_merch_id;
    }

    public void setOrder_merch_id(Long order_merch_id) {
        this.order_merch_id = order_merch_id;
    }

    public Integer getOrder_merch_num() {
        return order_merch_num;
    }

    public void setOrder_merch_num(Integer order_merch_num) {
        this.order_merch_num = order_merch_num;
    }

    public Double getOrder_merch_price() {
        return order_merch_price;
    }

    public void setOrder_merch_price(Double order_merch_price) {
        this.order_merch_price = order_merch_price;
    }

    public Integer getOrder_merch_status() {
        return order_merch_status;
    }

    public void setOrder_merch_status(Integer order_merch_status) {
        this.order_merch_status = order_merch_status;
    }

    public String getMerch_name() {
        return merch_name;
    }

    public void setMerch_name(String merch_name) {
        this.merch_name = merch_name;
    }
}
