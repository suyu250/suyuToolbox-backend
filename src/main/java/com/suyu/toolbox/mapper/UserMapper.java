package com.suyu.toolbox.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.suyu.toolbox.utils.user;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper extends BaseMapper<user> {
    @Select("select * from user where username = #{username} and password = #{password}")
    boolean checkUser(@Param("username") String username,@Param("password") String password);
}
