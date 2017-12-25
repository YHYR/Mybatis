package com.yhyr.mybatis.services.impl;

import com.yhyr.mybatis.domain.StudentInfo;
import com.yhyr.mybatis.mapper.StudentMapper.StudentInfoMapper;
import com.yhyr.mybatis.services.StudentService;
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
