package com.yhyr.mybatis.services;

import com.yhyr.mybatis.domain.StudentInfo;

import java.util.List;

/**
 * Created by YHYR on 2017-12-25
 */

public interface StudentService {
    List<StudentInfo> getStudentInfo();
}
