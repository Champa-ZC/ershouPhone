package com.qianfeng.recycle.controller;

import com.qianfeng.recycle.service.impl.PriceServiceImpl;
import com.qianfeng.recycle.vo.PriceVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("price")
public class PriceController {

    @Autowired
    private PriceServiceImpl priceService;

    private PriceVO priceVO = null;


    @ResponseBody
    @RequestMapping(value = "/{phoneId}/{infoArray}",method = RequestMethod.POST)
    public PriceVO queryPrice(@PathVariable("phoneId") Integer phoneId,@PathVariable("infoArray") String infoArray){
        String[] infos = infoArray.split(",");
        Integer discountRate = 0;
        for (String info : infos){
            Integer infoId = Integer.parseInt(info);
            if(infoId != 0){
                priceVO = priceService.queryPrice(phoneId,infoId);
                discountRate += priceVO.getDiscountRate();
            }

        }

        Integer price = priceVO.getPrice()*(100-discountRate)/100;
        System.out.println("折后价：" + price);
        priceVO.setPrice(price);
        return priceVO;
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public PriceVO backPage(){
        return priceVO;
    }


}
