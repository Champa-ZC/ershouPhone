package com.qianfeng.recycle.controller;


import com.qianfeng.recycle.service.impl.DamageServiceImpl;
import com.qianfeng.recycle.vo.DamageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("damage")
public class DamageController {

    @Autowired
    private DamageServiceImpl damageService;

    @ResponseBody
    @RequestMapping(value = "damage1/{phoneId}",method = RequestMethod.GET)
    public List<DamageVO> queryDamageAndInfo1(@PathVariable("phoneId") Integer phoneId){
        return damageService.queryDamageAndInfo1(phoneId);
    }

    @ResponseBody
    @RequestMapping(value = "damage2/{phoneId}",method = RequestMethod.GET)
    public List<DamageVO> queryDamageAndInfo2(@PathVariable("phoneId") Integer phoneId){
        return damageService.queryDamageAndInfo2(phoneId);
    }

    @ResponseBody
    @RequestMapping(value = "damage3/{phoneId}",method = RequestMethod.GET)
    public List<DamageVO> queryDamageAndInfo3(@PathVariable("phoneId") Integer phoneId){
        return damageService.queryDamageAndInfo3(phoneId);
    }
}
