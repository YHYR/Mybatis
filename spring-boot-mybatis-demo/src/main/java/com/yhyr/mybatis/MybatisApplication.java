package com.yhyr.mybatis;

import com.yhyr.mybatis.domain.UserInfo;
import com.yhyr.mybatis.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

/**
 * Created by YHYR on 2017-12-25
 */

@SpringBootApplication
public class MybatisApplication implements CommandLineRunner {

	@Autowired
	UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(MybatisApplication.class, args);
	}

	@Override
	public void run(String... strings){
		List<UserInfo> userInfoList = userService.getUserInfo();
		userInfoList.stream().forEach(userInfo -> System.out.println("name is : " + userInfo.getName() + "; sex is : " + userInfo.getSex() + "; age is : " + userInfo.getAge()));

	}
}
