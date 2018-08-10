package com.deloitte.cmats5.service;

import com.deloitte.cmats5.entity.MerchInfo;

import java.util.List;

public interface MerchService {

    MerchInfo getMerchById(Long merchId);

    List<MerchInfo> getMerch();

    void addMerch(MerchInfo merchInfo);

    void updateMerch(MerchInfo merchInfo);

    void deleteMerch(Long merchId);

    void updateMerchNum(MerchInfo merchInfo);
}
