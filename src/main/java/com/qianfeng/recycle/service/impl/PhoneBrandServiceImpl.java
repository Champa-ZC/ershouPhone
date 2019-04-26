package com.qianfeng.recycle.service.impl;

import com.qianfeng.recycle.mapper.PhoneBrandMapper;
import com.qianfeng.recycle.service.IPhoneBrandService;
import com.qianfeng.recycle.vo.PhoneBrandVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneBrandServiceImpl implements IPhoneBrandService {

    @Autowired
    private PhoneBrandMapper phoneBrandMapper;

    @Override
    public PhoneBrandVO queryPhoneByPhoneId(Integer phoneId) {
        return phoneBrandMapper.queryPhoneByPhoneId(phoneId);
    }
}
