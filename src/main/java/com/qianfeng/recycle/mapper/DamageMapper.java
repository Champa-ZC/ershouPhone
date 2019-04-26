package com.qianfeng.recycle.mapper;

import com.qianfeng.recycle.vo.DamageVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DamageMapper {

    List<DamageVO> queryDamageAndInfo(@Param("phoneId") Integer phoneId,
                                      @Param("beginDamageId") Integer beginDamageId,
                                      @Param("endDamageId") Integer endDamageId);
}
