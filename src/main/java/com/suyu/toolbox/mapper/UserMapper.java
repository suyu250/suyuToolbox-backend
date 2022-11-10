package com.suyu.toolbox.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.suyu.toolbox.utils.user;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<user> {
}
