package springs.SpringsWay.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "TestContext.xml" })
public class DependencyInjection2 {
	
	@Autowired
	GoodMorningService2 obj;

	@Test
	public void dummyTest() {
		System.out.println(obj.wishMe());
	}

}



@Component
class GoodMorningService2 {
	public String wishMe() {
		return "Good Morning 2";
	}

}

