package com.yhyr.mybatis.services;

import com.yhyr.mybatis.domain.UserInfo;

import java.util.List;

/**
 * Created by YHYR on 2017-12-25
 */

public interface UserService {
    List<UserInfo> getUserInfo();
}
