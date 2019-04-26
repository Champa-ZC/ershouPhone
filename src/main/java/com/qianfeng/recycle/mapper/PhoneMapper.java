package com.qianfeng.recycle.mapper;

import com.qianfeng.recycle.po.TbPhone;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PhoneMapper {

    List<TbPhone> queryAllPhone();

    List<TbPhone> queryPhoneByBrandId(@Param("brandId") Integer brandId);


}
