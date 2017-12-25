package com.yhyr.mybatis.dynamic.mapper;

import com.yhyr.mybatis.dynamic.domain.UserInfo;

import java.util.List;

/**
 * Created by YHYR on 2017-12-25
 */

public interface UserInfoMapper {
    List<UserInfo> getUserInfo();
}
