package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void sum() {
		System.out.println("in sum");
		int a=10;
		int b=20;
		Assert.assertEquals(a+b, 30);
	}
	
	@Test
	public void sub() {
		System.out.println("in sub");
		int a=10;
		int b=20;
		Assert.assertEquals(b-a, 10);
	}
	
	@Test
	public void div() {
		System.out.println("in div");
		int a=10;
		int b=20;
		Assert.assertEquals(b/a, 2);
	}
	
	@Test
	public void mul() {
		System.out.println("in mul");
		int a=10;
		int b=20;
		Assert.assertEquals(a*b, 200);
	}

}
