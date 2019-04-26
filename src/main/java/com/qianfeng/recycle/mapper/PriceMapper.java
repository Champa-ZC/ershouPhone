package com.qianfeng.recycle.mapper;

import com.qianfeng.recycle.vo.PriceVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface PriceMapper {


    PriceVO queryPrice(@Param("phoneId") Integer phoneId,@Param("infoId") Integer infoId);
}
