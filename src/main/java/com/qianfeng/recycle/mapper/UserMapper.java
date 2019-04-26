package com.qianfeng.recycle.mapper;

import com.qianfeng.recycle.po.TbUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

@Mapper
public interface UserMapper {

    TbUser checkUsername(@Param("username") String username);

    void saveUser(@Param("username") String username, @Param("password") String password);
}
