package com.jhiltonatr.jenkins;

import org.junit.Assert;
import org.junit.Test;

public class SomeClassTest {

	@Test
	public void test1() {
		Assert.assertEquals("OK", SomeClass.doSomething());
	}
}
