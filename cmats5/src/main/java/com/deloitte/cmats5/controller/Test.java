package com.deloitte.cmats5.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;


@RestController
public class Test {

    @RequestMapping("/test")
    public ModelAndView test(){
        //方式1
//        ModelAndView modelAndView = new ModelAndView("hello.html");
//        return modelAndView;

        //方式2
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("merchInfo");
        modelAndView.addObject("name","hanson");

        //Map
        Map<String,String> map = new HashMap<String,String>();
        map.put("zhangsan", "北京");
        map.put("lisi", "上海");
        map.put("wangwu", "深圳");
        modelAndView.addObject("map",map);
        return modelAndView;
    }
}
