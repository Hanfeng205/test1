package com.deloitte.cmats5.mapper;

import com.deloitte.cmats5.entity.MerchInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MerchInfoMapper {

    MerchInfo getMerchById(Long merchId);

    List<MerchInfo> getMerch();

    void addMerch(MerchInfo merchInfo);

    void updateMerch(MerchInfo merchInfo);

    void deleteMerch(Long merchId);

    void updateMerchNum(MerchInfo merchInfo);
}
