package com.yhyr.mybatis.dynamic.services;

import com.yhyr.mybatis.dynamic.domain.UserInfo;

import java.util.List;

/**
 * Created by YHYR on 2017-12-25
 */

public interface UserService {
    List<UserInfo> getUserInfo();
}
