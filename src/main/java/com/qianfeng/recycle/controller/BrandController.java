package com.qianfeng.recycle.controller;

import com.qianfeng.recycle.po.TbBrand;
import com.qianfeng.recycle.service.impl.BrandServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    private BrandServiceImpl brandService;

    @ResponseBody
    @RequestMapping(value="/{page}",method = RequestMethod.GET)
    public List<TbBrand> queryAllBrand(@PathVariable("page") Integer page){
//        System.out.println("进来了");
        return brandService.queryAllBrand();
    }

}
