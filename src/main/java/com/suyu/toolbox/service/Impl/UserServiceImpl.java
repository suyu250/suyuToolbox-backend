package com.suyu.toolbox.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.suyu.toolbox.mapper.UserMapper;
import com.suyu.toolbox.service.UserService;
import com.suyu.toolbox.utils.user;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, user> implements UserService {

}
