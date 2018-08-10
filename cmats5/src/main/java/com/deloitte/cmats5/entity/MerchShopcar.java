package com.deloitte.cmats5.entity;

public class MerchShopcar {
    private Long shopcar_id;

    private Long merch_id;

    private Long user_id;

    private Integer shopcar_merch_num;

    private Integer shopcar_status;

    public Long getShopcar_id() {
        return shopcar_id;
    }

    public void setShopcar_id(Long shopcar_id) {
        this.shopcar_id = shopcar_id;
    }

    public Long getMerch_id() {
        return merch_id;
    }

    public void setMerch_id(Long merch_id) {
        this.merch_id = merch_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Integer getShopcar_merch_num() {
        return shopcar_merch_num;
    }

    public void setShopcar_merch_num(Integer shopcar_merch_num) {
        this.shopcar_merch_num = shopcar_merch_num;
    }

    public Integer getShopcar_status() {
        return shopcar_status;
    }

    public void setShopcar_status(Integer shopcar_status) {
        this.shopcar_status = shopcar_status;
    }
}
