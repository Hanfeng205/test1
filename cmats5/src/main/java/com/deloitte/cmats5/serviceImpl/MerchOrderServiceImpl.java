package com.deloitte.cmats5.serviceImpl;

import com.deloitte.cmats5.entity.OrderMerch;
import com.deloitte.cmats5.entity.Orders;
import com.deloitte.cmats5.mapper.MerchOrderMapper;
import com.deloitte.cmats5.service.MerchOrderService;
import com.deloitte.cmats5.utils.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchOrderServiceImpl implements MerchOrderService {

    @Autowired(required = false)
    public MerchOrderMapper merchOrderMapper;

    @Override
    public List<OrderDetail> getOrderDetail(Long orderId) {
        return merchOrderMapper.getOrderDetail(orderId);
    }

    @Override
    public void addOrder(Orders orders) {
        merchOrderMapper.addOrder(orders);
    }

    @Override
    public Orders getOrderId(Orders orders) {
        return merchOrderMapper.getOrderId(orders);
    }

    @Override
    public List<OrderMerch> getOrderMerch(Long userId) {
        return merchOrderMapper.getOrderMerch(userId);
    }

    @Override
    public void addOrderMerch(OrderMerch orderMerch) {
        merchOrderMapper.addOrderMerch(orderMerch);
    }


}
