package com.deloitte.cmats5.service;

import com.deloitte.cmats5.entity.OrderMerch;
import com.deloitte.cmats5.entity.Orders;
import com.deloitte.cmats5.utils.OrderDetail;

import java.util.List;

public interface MerchOrderService {

    List<OrderDetail> getOrderDetail(Long orderId);

    void addOrder(Orders orders);

    Orders getOrderId(Orders orders);

    List<OrderMerch> getOrderMerch(Long userId);

    void addOrderMerch(OrderMerch orderMerch);
}
