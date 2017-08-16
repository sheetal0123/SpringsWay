package springs.SpringsWay.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "TestContext.xml" })
public class DependencyInjection3 {

	@Autowired
	HiService obj;

	@Test
	public void dummyTest() {
		System.out.println(obj.sayHi());
	}

}

@Component
class GoodMorningService3 implements HiService {

	@Override
	public String sayHi() {
		return "Hi, Good Morning";
	}

}