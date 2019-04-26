package com.qianfeng.recycle.controller;


import com.qianfeng.recycle.service.impl.PhoneBrandServiceImpl;
import com.qianfeng.recycle.vo.PhoneBrandVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("phoneBrand")
public class PhoneBrandController {

    @Autowired
    private PhoneBrandServiceImpl phoneBrandService;

    @ResponseBody
    @RequestMapping(value = "/{phoneId}",method = RequestMethod.GET)
    public PhoneBrandVO queryPhoneByPhoneId(@PathVariable("phoneId") Integer phoneId){
        return phoneBrandService.queryPhoneByPhoneId(phoneId);
    }
}
