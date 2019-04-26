package com.qianfeng.recycle.service;

import com.qianfeng.recycle.vo.DamageVO;

import java.util.List;

public interface IDamageService {

    List<DamageVO> queryDamageAndInfo1(Integer phoneId);
    List<DamageVO> queryDamageAndInfo2(Integer phoneId);
    List<DamageVO> queryDamageAndInfo3(Integer phoneId);
}
