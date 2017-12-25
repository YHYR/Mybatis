package com.yhyr.mybatis.dynamic.services.impl;

import com.yhyr.mybatis.dynamic.domain.DBInfo;
import com.yhyr.mybatis.dynamic.mapper.DBInfoMapper;
import com.yhyr.mybatis.dynamic.services.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by YHYR on 2017-12-25
 */

@Service
public class DBServiceImpl implements DBService {
    @Autowired
    DBInfoMapper dbInfoMapper;

    @Override
    public DBInfo getDBInfoByprimayrId(int primayrId) {
        return dbInfoMapper.getDBInfoById(primayrId);
    }
}
