package com.item.liketmal.controller;

import com.item.liketmal.domain.entity.ShopCart;
import com.item.liketmal.service.ShopCartService;
import com.item.liketmal.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ShowCartController {

    @Resource
    ShopCartService shopCartService;

    @RequestMapping("/shopcart")
    public Result shopcart(){
        Result result = shopCartService.showCartMapper();
        return result;
    }
}
