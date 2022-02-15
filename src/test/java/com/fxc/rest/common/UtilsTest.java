package com.fxc.rest.common;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class UtilsTest {

	private static final String FOO_TEST = "Foo";
	private static final String BAR_TEST = "Bar";
	private static final String QIX_TEST = "Qix";
	private static final String STAR_TEST = "*";
	
	@Test
	public void addFooTestNull() {
		assertEquals(FOO_TEST, Utils.addFoo(null));
	}
	
	@Test
	public void addFooTestEmpty() {
		assertEquals(FOO_TEST, Utils.addFoo(""));
	}
	
	@Test
	public void addFooTest() {
		String toTest = " ";
		assertEquals(toTest + FOO_TEST, Utils.addFoo(toTest));
		
		toTest = "35456413";
		assertEquals(toTest + FOO_TEST, Utils.addFoo(toTest));
	}
	
	@Test
	public void addBarTestNull() {
		assertEquals(BAR_TEST, Utils.addBar(null));
	}
	
	@Test
	public void addBarTestEmpty() {
		assertEquals(BAR_TEST, Utils.addBar(""));
	}
	
	@Test
	public void addBarTest() {
		String toTest = " ";
		assertEquals(toTest + BAR_TEST, Utils.addBar(toTest));
		
		toTest = "35456413";
		assertEquals(toTest + BAR_TEST, Utils.addBar(toTest));
	}
	
	@Test
	public void addQixTestNull() {
		assertEquals(QIX_TEST, Utils.addQix(null));
	}
	
	@Test
	public void addQixTestEmpty() {
		assertEquals(QIX_TEST, Utils.addQix(""));
	}
	
	@Test
	public void addQixTest() {
		String toTest = " ";
		assertEquals(toTest + QIX_TEST, Utils.addQix(toTest));
		
		toTest = "35456413";
		assertEquals(toTest + QIX_TEST, Utils.addQix(toTest));
	}
	
	@Test
	public void addStarTestNull() {
		assertEquals(STAR_TEST, Utils.addStar(null));
	}
	
	@Test
	public void addStarTestEmpty() {
		assertEquals(STAR_TEST, Utils.addStar(""));
	}
	
	@Test
	public void addStarTest() {
		String toTest = " ";
		assertEquals(toTest + STAR_TEST, Utils.addStar(toTest));
		
		toTest = "35456413";
		assertEquals(toTest + STAR_TEST, Utils.addStar(toTest));
	}
	
	@Test
	public void isModuloTestTrue() {
		assertTrue(Utils.isModulo(0, 5));
		assertTrue(Utils.isModulo(10, 5));
		assertTrue(Utils.isModulo(21, 3));
	}
	
	@Test
	public void isModuloTestFalse() {
		assertFalse(Utils.isModulo(1, 5));
		assertFalse(Utils.isModulo(9, 5));
		assertFalse(Utils.isModulo(22, 3));
	}
	
	@Test
	public void replace0TestWithDigit() {
		assertEquals("1*1", Utils.replace0(101));
		assertEquals("1*", Utils.replace0(10));
		assertEquals("2***1", Utils.replace0(20001));
		assertEquals("1***5**", Utils.replace0(1000500));
	}
}
