package springs.SpringsWay.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "TestContext.xml" })
public class DependencyInjection4 {

	@Autowired
	@Qualifier(value = "goodMorningService4")
	HiService obj;

	@Test
	public void dummyTest() {
		System.out.println(obj.sayHi());
	}

}

@Component
class GoodMorningService4 implements HiService {
	@Override
	public String sayHi() {
		return "Hi, Good Morning";
	}
}


@Component
class GoodNightService4 implements HiService {
	@Override
	public String sayHi() {
		return "Hi, Good Night";
	}
}