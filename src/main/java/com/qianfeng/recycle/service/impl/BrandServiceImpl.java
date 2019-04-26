package com.qianfeng.recycle.service.impl;

import com.qianfeng.recycle.mapper.BrandMapper;
import com.qianfeng.recycle.po.TbBrand;
import com.qianfeng.recycle.service.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements IBrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<TbBrand> queryAllBrand() {
        return brandMapper.queryAllBrand();
    }
}
