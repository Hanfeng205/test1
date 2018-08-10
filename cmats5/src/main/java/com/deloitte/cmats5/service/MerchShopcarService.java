package com.deloitte.cmats5.service;

import com.deloitte.cmats5.entity.MerchShopcar;

import java.util.List;

public interface MerchShopcarService {

    void addShopcar(MerchShopcar merchShopcar);

    MerchShopcar getShopcarById(MerchShopcar merchShopcar);

    List<MerchShopcar> getShopcarByUserId(Long userId);

    void updateShopcarById(MerchShopcar merchShopcar);

    void deleteShopcar(MerchShopcar merchShopcar);

    double getShopcarPrice(Long userId);
}
