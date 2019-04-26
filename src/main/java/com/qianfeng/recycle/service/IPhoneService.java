package com.qianfeng.recycle.service;

import com.qianfeng.recycle.po.TbPhone;

import java.util.List;

public interface IPhoneService {

    List<TbPhone> queryAllPhone();

    List<TbPhone> queryPhoneByBrandId(Integer brandId);

}
