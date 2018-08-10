package com.deloitte.cmats5.controller;

import com.deloitte.cmats5.entity.MerchShopcar;
import com.deloitte.cmats5.service.MerchShopcarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShopcarController {

    @Autowired
    public MerchShopcarService merchShopcarService;

    /**
     * 购物车
     * @param merch_id
     * @param user_id
     * @param shopcar_merch_num
     * @param shopcar_status
     */
    @RequestMapping(value = "/addShopcar", method = RequestMethod.POST)
    public void addShopcar(@RequestParam("merch_id") Long merch_id,
                           @RequestParam("user_id") Long user_id,
                           @RequestParam("shopcar_merch_num") int shopcar_merch_num,
                           @RequestParam("shopcar_status") int shopcar_status) {
        MerchShopcar merchShopcar = new MerchShopcar();
        merchShopcar.setShopcar_id(null);
        merchShopcar.setMerch_id(merch_id);
        merchShopcar.setUser_id(user_id);
        merchShopcar.setShopcar_merch_num(shopcar_merch_num);
        merchShopcar.setShopcar_status(shopcar_status);
        merchShopcarService.addShopcar(merchShopcar);
    }

    /**
     * 根据商品ID和用户ID获取购物车信息
     * @param merch_id
     * @param user_id
     * @return
     */
    @RequestMapping(value = "/getShopcarById/{merch_id}/{user_id}", method = RequestMethod.GET)
    public MerchShopcar getShopcarById(@PathVariable("merch_id") Long merch_id,
                                       @PathVariable("user_id") Long user_id) {
        MerchShopcar merchShopcar = new MerchShopcar();
        merchShopcar.setMerch_id(merch_id);
        merchShopcar.setUser_id(user_id);
        return merchShopcarService.getShopcarById(merchShopcar);
    }

    /**
     * 根据用户ID获取购物车信息
     * @param uerId
     * @return
     */
    @RequestMapping(value = "/getShopcarByUserId/{userId}", method = RequestMethod.GET)
    public List<MerchShopcar> getShopcarByUserId(@PathVariable("userId") Long uerId) {
        return merchShopcarService.getShopcarByUserId(uerId);
    }

    /**
     * 更新购物车信息
     * @param merch_id
     * @param user_id
     * @param shopcar_merch_num
     * @param shopcar_status
     */
    @RequestMapping(value = "/updateShopcarById", method = RequestMethod.PUT)
    public void updateShopcarById(@RequestParam("merch_id") Long merch_id,
                                  @RequestParam("user_id") Long user_id,
                                  @RequestParam("shopcar_merch_num") int shopcar_merch_num,
                                  @RequestParam("shopcar_status") int shopcar_status) {
        MerchShopcar merchShopcar1 = getShopcarById(merch_id,user_id);
        if (merchShopcar1.getMerch_id() == merch_id && merchShopcar1.getUser_id() == user_id){
            MerchShopcar merchShopcar2 = new MerchShopcar();
            merchShopcar2.setShopcar_id(merchShopcar1.getShopcar_id());
            merchShopcar2.setShopcar_merch_num(shopcar_merch_num + merchShopcar1.getShopcar_merch_num());
            merchShopcarService.updateShopcarById(merchShopcar2);
        }else {
            addShopcar(merch_id,user_id,shopcar_merch_num,shopcar_status);
        }
    }

    /**
     * 删除购物车商品
     * @param userId
     * @param merchId
     */
    @RequestMapping (value = "/deleteShopcar/{userId}/{merchid}", method = RequestMethod.DELETE)
    public void deleteShopcar(@PathVariable("userId") Long userId,
                              @PathVariable("merchId") Long merchId) {
        MerchShopcar merchShopcar = new MerchShopcar();
        merchShopcar.setUser_id(userId);
        merchShopcar.setMerch_id(merchId);
        merchShopcarService.deleteShopcar(merchShopcar);
    }

    /**
     * 根据用户ID获取购物车总价
     * @param userId
     * @return
     */
    @RequestMapping(value = "/getShopcarPrice/{userId}", method = RequestMethod.GET)
    public double getShopcarPrice(@PathVariable("userId") Long userId) {
        return merchShopcarService.getShopcarPrice(userId);
    }

}
