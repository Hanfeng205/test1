package com.deloitte.cmats5.serviceImpl;

import com.deloitte.cmats5.entity.MerchShopcar;
import com.deloitte.cmats5.mapper.MerchShopcarMapper;
import com.deloitte.cmats5.service.MerchShopcarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchShopcarServiceImpl implements MerchShopcarService {

    @Autowired(required = false)
    public MerchShopcarMapper merchShopcarMapper;

    @Override
    public void addShopcar(MerchShopcar merchShopcar) {
        merchShopcarMapper.addShopcar(merchShopcar);
    }

    @Override
    public MerchShopcar getShopcarById(MerchShopcar merchShopcar) {
        return merchShopcarMapper.getShopcarById(merchShopcar);
    }

    @Override
    public List<MerchShopcar> getShopcarByUserId(Long userId) {
        return merchShopcarMapper.getShopcarByUserId(userId);
    }

    @Override
    public void updateShopcarById(MerchShopcar merchShopcar) {
        merchShopcarMapper.updateShopcarById(merchShopcar);
    }

    @Override
    public void deleteShopcar(MerchShopcar merchShopcar) {
        merchShopcarMapper.deleteShopcar(merchShopcar);
    }

    @Override
    public double getShopcarPrice(Long userId) {
        return merchShopcarMapper.getShopcarPrice(userId);
    }

}
