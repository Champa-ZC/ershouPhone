package com.qianfeng.recycle.mapper;

import com.qianfeng.recycle.vo.PhoneBrandVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PhoneBrandMapper {

    PhoneBrandVO queryPhoneByPhoneId(@Param("phoneId") Integer phoneId);
}
