package com.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "TestContextNew.xml" })
public class DependencyInjectionTest {
	
	@Autowired
	GoodMorningServiceNew obj;

	@Test
	public void dummyTest() {
		System.out.println(obj.wishMe());
	}

}



@Component
class GoodMorningServiceNew {
	public String wishMe() {
		return "Good Morning 2";
	}

}

