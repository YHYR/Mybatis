package com.yhyr.mybatis.services.impl;

import com.yhyr.mybatis.domain.UserInfo;
import com.yhyr.mybatis.mapper.UserMapper.UserInfoMapper;
import com.yhyr.mybatis.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by YHYR on 2017-12-25
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> getUserInfo() {
        return userInfoMapper.getUserInfo();
    }
}
