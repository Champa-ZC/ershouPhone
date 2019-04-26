package com.qianfeng.recycle.service.impl;

import com.qianfeng.recycle.mapper.DamageMapper;
import com.qianfeng.recycle.service.IDamageService;
import com.qianfeng.recycle.utils.ConstansUtils;
import com.qianfeng.recycle.vo.DamageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DamageServiceImpl implements IDamageService {

    @Autowired
    private DamageMapper damageMapper;

    @Override
    public List<DamageVO> queryDamageAndInfo1(Integer phoneId) {
        return damageMapper.queryDamageAndInfo(phoneId, ConstansUtils.beginDamageId1,ConstansUtils.endDamageId1);
    }

    @Override
    public List<DamageVO> queryDamageAndInfo2(Integer phoneId) {
        return damageMapper.queryDamageAndInfo(phoneId, ConstansUtils.beginDamageId2,ConstansUtils.endDamageId2);
    }

    @Override
    public List<DamageVO> queryDamageAndInfo3(Integer phoneId) {
        return damageMapper.queryDamageAndInfo(phoneId, ConstansUtils.beginDamageId3,ConstansUtils.endDamageId3);
    }
}
