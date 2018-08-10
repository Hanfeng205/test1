package com.deloitte.cmats5.serviceImpl;

import com.deloitte.cmats5.entity.MerchInfo;
import com.deloitte.cmats5.mapper.MerchInfoMapper;
import com.deloitte.cmats5.service.MerchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchServiceImpl implements MerchService {

    @Autowired(required = false)
    public MerchInfoMapper merchInfoMapper;


    @Override
    public MerchInfo getMerchById(Long id) {
        return merchInfoMapper.getMerchById(id);
    }

    @Override
    public List<MerchInfo> getMerch() {
        return merchInfoMapper.getMerch();
    }

    @Override
    public void addMerch(MerchInfo merchInfo) {
        merchInfoMapper.addMerch(merchInfo);
    }

    @Override
    public void updateMerch(MerchInfo merchInfo) {
        merchInfoMapper.updateMerch(merchInfo);
    }

    @Override
    public void deleteMerch(Long merchId) {
        merchInfoMapper.deleteMerch(merchId);
    }

    @Override
    public void updateMerchNum(MerchInfo merchInfo) {
        merchInfoMapper.updateMerchNum(merchInfo);
    }


}
