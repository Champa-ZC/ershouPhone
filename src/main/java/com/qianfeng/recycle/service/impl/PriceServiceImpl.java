package com.qianfeng.recycle.service.impl;

import com.qianfeng.recycle.mapper.PriceMapper;
import com.qianfeng.recycle.service.IPriceService;
import com.qianfeng.recycle.vo.PriceVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriceServiceImpl implements IPriceService {

    @Autowired
    private PriceMapper priceMapper;

    @Override
    public PriceVO queryPrice(Integer phoneId, Integer infoId) {
        return priceMapper.queryPrice(phoneId, infoId);
    }
}
