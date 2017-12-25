package com.yhyr.mybatis.dynamic.mapper;

import com.yhyr.mybatis.dynamic.domain.DBInfo;

/**
 * Created by YHYR on 2017-12-25
 */

public interface DBInfoMapper {
    DBInfo getDBInfoById(int primayrId);
}
