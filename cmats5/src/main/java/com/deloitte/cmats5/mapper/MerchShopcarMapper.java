package com.deloitte.cmats5.mapper;

import com.deloitte.cmats5.entity.MerchShopcar;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MerchShopcarMapper {

    void addShopcar(MerchShopcar merchShopcar);

    MerchShopcar getShopcarById(MerchShopcar merchShopcar);

    List<MerchShopcar> getShopcarByUserId(Long userId);

    void updateShopcarById(MerchShopcar merchShopcar);

    void deleteShopcar(MerchShopcar merchShopcar);

    double getShopcarPrice(Long userId);



}
