package com.qianfeng.recycle.controller;

import com.qianfeng.recycle.po.TbPhone;
import com.qianfeng.recycle.service.impl.PhoneServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("phone")
public class PhoneController {

    @Autowired
    private PhoneServiceImpl phoneService;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public List<TbPhone> queryAllPhone(){
        return phoneService.queryAllPhone();
    }

    @ResponseBody
    @RequestMapping(value = "/{brandId}",method = RequestMethod.GET)
    public List<TbPhone> queryPhoneByBrandId(@PathVariable("brandId") Integer brandId){
        return phoneService.queryPhoneByBrandId(brandId);
    }


}
