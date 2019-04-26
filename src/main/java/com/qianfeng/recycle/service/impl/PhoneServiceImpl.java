package com.qianfeng.recycle.service.impl;

import com.qianfeng.recycle.mapper.PhoneMapper;
import com.qianfeng.recycle.po.TbPhone;
import com.qianfeng.recycle.service.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneServiceImpl implements IPhoneService {

    @Autowired
    private PhoneMapper phoneMapper;

    @Override
    public List<TbPhone> queryAllPhone() {
        return phoneMapper.queryAllPhone();
    }

    @Override
    public List<TbPhone> queryPhoneByBrandId(Integer brandId) {
        return phoneMapper.queryPhoneByBrandId(brandId);
    }

}
