package com.deloitte.cmats5.entity;

public class OrderMerch {
    private Long order_merch_id;

    private Long merch_id;

    private Long order_id;

    private Integer order_merch_num;

    private Double order_merch_price;

    private Integer order_merch_status;

    public Long getOrder_merch_id() {
        return order_merch_id;
    }

    public void setOrder_merch_id(Long order_merch_id) {
        this.order_merch_id = order_merch_id;
    }

    public Long getMerch_id() {
        return merch_id;
    }

    public void setMerch_id(Long merch_id) {
        this.merch_id = merch_id;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
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

    @Override
    public String toString() {
        return "OrderMerch{" +
                "order_merch_id=" + order_merch_id +
                ", merch_id=" + merch_id +
                ", order_id=" + order_id +
                ", order_merch_num=" + order_merch_num +
                ", order_merch_price=" + order_merch_price +
                ", order_merch_status=" + order_merch_status +
                '}';
    }
}
