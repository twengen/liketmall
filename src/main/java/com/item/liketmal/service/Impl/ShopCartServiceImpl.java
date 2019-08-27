package com.item.liketmal.service.Impl;

import com.item.liketmal.domain.entity.ShopCart;
import com.item.liketmal.mapper.ShowCartMapper;
import com.item.liketmal.service.ShopCartService;
import com.item.liketmal.utils.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShopCartServiceImpl implements ShopCartService {

    @Resource
    ShowCartMapper CartMapper;

    @Override
    public Result showCartMapper(){
//        Result<List<ShopCart>> listResult = new Result<>();
        try{
            System.out.println("start service");
            List<ShopCart> findshopcart = CartMapper.findshopcart();
            return Result.success(findshopcart);
        }catch (Exception e ){
            return Result.error();
        }
    }

}
