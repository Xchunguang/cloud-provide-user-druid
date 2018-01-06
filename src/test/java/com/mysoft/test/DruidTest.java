package com.mysoft.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mysoft.druid.module.User;
import com.mysoft.druid.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=com.mysoft.druid.UserApplication.class)
public class DruidTest {

	@Autowired
	UserRepository userRepository;
	
	
	@Test
	public void testRep(){
		List<User> list = userRepository.findAll();
		System.out.println(list.size());
	}
	
}
