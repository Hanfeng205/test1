package com.deloitte.cmats5.controller;

import com.deloitte.cmats5.entity.MerchInfo;
import com.deloitte.cmats5.service.MerchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class MerchInfoController {

    @Autowired
    public MerchService merchService;

    /**
     * 根据商品ID查询单个商品信息
     * @param merchId
     * @return
     */
    @RequestMapping(value = "/getMerchInfoById/{merchId}", method = RequestMethod.GET)
    public MerchInfo getMerchInfoById(@PathVariable("merchId") Long merchId) {
        return merchService.getMerchById(merchId);
    }

    /**
     * 查询所有商品信息
     * @return
     */
    @RequestMapping(value = "/getMerch", method = RequestMethod.GET)
    public List<MerchInfo> getMerch() {
        return merchService.getMerch();
    }

    @RequestMapping(value = "/merchInfo")
    public ModelAndView merchList(){
        ModelAndView modelAndView = new ModelAndView("merchInfo/merchInfo");
        modelAndView.addObject("merchList",getMerch());
        return modelAndView;
    }

    /**
     * 新增按钮跳转
     * @return
     */
    @RequestMapping(value = "/addMerchInfo")
    public ModelAndView addMerchInfo(){
        ModelAndView modelAndView = new ModelAndView("merchInfo/addMerch");
        return modelAndView;
    }
    /**
     * 添加商品
     * @param merch_name
     * @param merch_price
     * @param merch_num
     */
    @RequestMapping(value = "/addMerch", method = RequestMethod.GET)
    public ModelAndView addMerch(@RequestParam("merch_name") String merch_name,
                         @RequestParam("merch_price") double merch_price,
                         @RequestParam("merch_num") int merch_num) {
        System.out.println(merch_name);
        MerchInfo merchInfo = new MerchInfo();
        merchInfo.setMerch_name(merch_name);
        merchInfo.setMerch_price(merch_price);
        merchInfo.setMerch_num(merch_num);
        merchService.addMerch(merchInfo);
        return merchList();
    }

    /**
     * 更新商品信息
     * @param merchId
     * @param merchName
     * @param merchPrice
     * @param merchNum
     */
    @RequestMapping(value = "/updateMerch/{merchId}", method = RequestMethod.PUT)
    public void updateMerch(@PathVariable("merchId") Long merchId,
                            @RequestParam("merchName") String merchName,
                            @RequestParam("merchPrice") double merchPrice,
                            @RequestParam("merchNum") int merchNum) {
        MerchInfo merchInfo = new MerchInfo();
        merchInfo.setMerch_id(merchId);
        merchInfo.setMerch_name(merchName);
        merchInfo.setMerch_price(merchPrice);
        merchInfo.setMerch_num(merchNum);
        merchService.updateMerch(merchInfo);
    }

    /**
     * 删除一个商品
     * @param merchId
     */
    @RequestMapping(value = "/deleteMerch/{merchId}", method = RequestMethod.DELETE)
    public void deleteMerch(@PathVariable("merchId") Long merchId) {
        merchService.deleteMerch(merchId);
    }


}
