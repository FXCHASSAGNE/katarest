package com.fxc.rest.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import com.fxc.rest.service.impl.FooBarQixServiceImpl;

public class FooBarQixServiceTest {

	@InjectMocks
	FooBarQixService fooBarQixService;
	
	@BeforeEach
	public void setUp() {
		fooBarQixService = new FooBarQixServiceImpl();
	}
	
	@Test
	public void computeStringTest() {
		assertEquals("1", fooBarQixService.computeString(1));
		assertEquals("2", fooBarQixService.computeString(2));
		assertEquals("FooFoo", fooBarQixService.computeString(3));
		assertEquals("4", fooBarQixService.computeString(4));
		assertEquals("BarBar", fooBarQixService.computeString(5));
		assertEquals("Foo", fooBarQixService.computeString(6));
		assertEquals("QixQix", fooBarQixService.computeString(7));
		assertEquals("8", fooBarQixService.computeString(8));
		assertEquals("Foo", fooBarQixService.computeString(9));
		assertEquals("Bar", fooBarQixService.computeString(10));
		assertEquals("Foo", fooBarQixService.computeString(13));
		assertEquals("FooBarBar", fooBarQixService.computeString(15));
		assertEquals("FooQix", fooBarQixService.computeString(21));
		assertEquals("FooFooFoo", fooBarQixService.computeString(33));
		assertEquals("FooBar", fooBarQixService.computeString(51));
		assertEquals("BarFoo", fooBarQixService.computeString(53));
	}
	
	@Test
	public void computeStringV2Test() {
		assertEquals("1*1", fooBarQixService.computeStringV2(101));
		assertEquals("FooFoo*Foo", fooBarQixService.computeStringV2(303));
		assertEquals("FooBarQix*Bar", fooBarQixService.computeStringV2(105));
		assertEquals("FooQix**", fooBarQixService.computeStringV2(10101));
	}
}
