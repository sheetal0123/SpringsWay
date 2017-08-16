package springs.SpringsWay.controller;

import org.junit.Test;

//DI1.java has dependency on GMS1.java
public class DependencyInjection1 {
	
	//init obj here
	GoodMorningService1 obj = new GoodMorningService1();

	@Test
	public void dummyTest() {
		System.out.println(obj.wishMe());
	}

}

class GoodMorningService1 {

	public String wishMe() {
		return "Good Morning";
	}

}