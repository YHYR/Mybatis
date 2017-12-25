package com.yhyr.mybatis.dynamic.services.impl;

import com.yhyr.mybatis.dynamic.domain.StudentInfo;
import com.yhyr.mybatis.dynamic.mapper.StudentInfoMapper;
import com.yhyr.mybatis.dynamic.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by YHYR on 2017-12-25
 */

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentInfoMapper studentInfoMapper;

    @Override
    public List<StudentInfo> getStudentInfo() {
        return studentInfoMapper.getStudentInfo();
    }
}
