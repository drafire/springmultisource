package com.drafire.springmultisource;

import com.drafire.springmultisource.config.Global;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringmultisourceApplicationTests {

	@Autowired
	private Global global;

	@Test
	public void contextLoads() {

	}

	@Test
	public void testValue(){
		System.out.println(global.getSellUrl());
	}
}
