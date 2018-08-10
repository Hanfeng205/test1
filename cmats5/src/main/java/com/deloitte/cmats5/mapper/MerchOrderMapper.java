package com.deloitte.cmats5.mapper;

import com.deloitte.cmats5.entity.OrderMerch;
import com.deloitte.cmats5.entity.Orders;
import com.deloitte.cmats5.entity.User;
import com.deloitte.cmats5.utils.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MerchOrderMapper {

    List<OrderDetail> getOrderDetail(Long orderId);

    void addOrder(Orders orders);

    Orders getOrderId(Orders orders);

    List<OrderMerch> getOrderMerch(Long userId);

    void addOrderMerch(OrderMerch orderMerch);
}
