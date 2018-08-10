package com.deloitte.cmats5.controller;

import com.deloitte.cmats5.entity.*;
import com.deloitte.cmats5.service.MerchOrderService;
import com.deloitte.cmats5.service.MerchService;
import com.deloitte.cmats5.service.MerchShopcarService;
import com.deloitte.cmats5.service.UserService;
import com.deloitte.cmats5.utils.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MerchOrderController {
    @Autowired
    public UserService userService;

    @Autowired
    public MerchService merchService;

    @Autowired
    public MerchOrderService merchOrderService;

    @Autowired
    public MerchShopcarService merchShopcarService;

    /**
     * 根据订单ID获取订单详情
     * @param orderId
     * @return
     */
    @RequestMapping(value = "/getOrderDetail/{orderId}", method = RequestMethod.GET)
    public List<OrderDetail> getOrderDetail(@PathVariable("orderId") Long orderId) {
        return merchOrderService.getOrderDetail(orderId);
    }

    /**
     * 根据用户ID和订单价格获取当前订单号
     * @param userId
     * @param order_price
     * @return
     */
    @RequestMapping(value = "/getOrderId/{userId}/{order_price}", method = RequestMethod.GET)
    public Orders getOrderId(@PathVariable("userId") Long userId,
                             @PathVariable("order_price") double order_price) {
        Orders orders = new Orders();
        orders.setUser_id(userId);
        orders.setOrder_price(order_price);
        return merchOrderService.getOrderId(orders);
    }

    /**
     * 根据用户ID获取订单商品信息
     * @param userId
     * @return
     */
    @RequestMapping(value = "/getOrderMerch/{userId}", method = RequestMethod.GET)
    public List<OrderMerch> getOrderMerch(@PathVariable("userId") Long userId) {
        return merchOrderService.getOrderMerch(userId);
    }

    @RequestMapping(value = "/addOrderMerch", method = RequestMethod.GET)
    public void addOrderMerch(@RequestParam("merch_id") Long merch_id,
                              @RequestParam("order_id") Long order_id,
                              @RequestParam("order_merch_num") int order_merch_num,
                              @RequestParam("order_merch_price") double order_merch_price) {
        order_id = Long.valueOf(10);
        OrderMerch orderMerch = new OrderMerch();
        orderMerch.setMerch_id(merch_id);
        orderMerch.setOrder_id(order_id);
        orderMerch.setOrder_merch_num(order_merch_num);
        orderMerch.setOrder_merch_price(order_merch_price);
        orderMerch.setOrder_merch_status(1);
        merchOrderService.addOrderMerch(orderMerch);
    }

    /**
     * 生成订单
     * @param userId
     */
    @RequestMapping(value = "/addOrder", method = RequestMethod.POST)
    public void addOrder(@RequestParam("userId") Long userId) {
        double order_price = merchShopcarService.getShopcarPrice(userId);
        Orders orders = new Orders();
        orders.setUser_id(userId);
        orders.setOrder_status(1);
        orders.setOrder_price(order_price);
        //订单表
        merchOrderService.addOrder(orders);
        //获取当订单号
        Orders orders1 = merchOrderService.getOrderId(orders);
        //订单商品表
        List<OrderMerch> orderMerchList = merchOrderService.getOrderMerch(userId);
        for (int i = 0; i<orderMerchList.size(); i++) {
            OrderMerch orderMerch = new OrderMerch();
            orderMerch.setMerch_id(orderMerchList.get(i).getMerch_id());
            orderMerch.setOrder_id(orders1.getOrder_id());
            orderMerch.setOrder_merch_num(orderMerchList.get(i).getOrder_merch_num());
            orderMerch.setOrder_merch_price(orderMerchList.get(i).getOrder_merch_price());
            orderMerch.setOrder_merch_status(1);
            merchOrderService.addOrderMerch(orderMerch);
            //商品库存更新
            MerchInfo merchInfo = merchService.getMerchById(orderMerchList.get(i).getMerch_id());
            merchInfo.setMerch_num(merchInfo.getMerch_num()-orderMerchList.get(i).getOrder_merch_num());
            merchService.updateMerchNum(merchInfo);

            //删除购物车
            MerchShopcar merchShopcar = new MerchShopcar();
            merchShopcar.setUser_id(userId);
            merchShopcar.setMerch_id(orderMerchList.get(i).getMerch_id());
            merchShopcarService.deleteShopcar(merchShopcar);
        }
        //用户支付
        User user = userService.getUser(userId);
        System.out.println(user.getUser_money()+ "  "+ order_price);
        user.setUser_money(user.getUser_money()-order_price);
        userService.updateUser(user);
    }
}
