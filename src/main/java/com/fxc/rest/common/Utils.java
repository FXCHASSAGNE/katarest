package com.fxc.rest.common;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.util.StringUtils;

/**
 * generic methods 
 * @author fxchassagne
 *
 */
public final class Utils {

	private static final String FOO = "Foo";
	private static final String BAR = "Bar";
	private static final String QIX = "Qix";
	private static final String STAR = "*";
	
	/**
	 * add the Foo string to {@link s}
	 * @param s the string to modify
	 * @return the modified string
	 */
	public static String addFoo(String s) {
        return addString(s, FOO);
    }
    
	/**
	 * add the Bar string to {@link s}
	 * @param s the string to modify
	 * @return the modified string
	 */
	public static String addBar(String s) {
        return addString(s, BAR);
    }
    
	/**
	 * add the Qix string to {@link s}
	 * @param s the string to modify
	 * @return the modified string
	 */
	public static String addQix(String s) {
        return addString(s, QIX);
    }
    
	/**
	 * add the * string to {@link s}
	 * @param s the string to modify
	 * @return the modified string
	 */
	public static String addStar(String s) {
        return addString(s, STAR);
    }
	
	/**
	 * test if a number is a modulo of {@link modulo}
	 * @param number the number to test
	 * @param modulo the number to use as a modulo
	 * @return true if {@link number} is a modulo of {@link modulo}
	 */
	public static boolean isModulo(int number, int modulo) {
        return number % modulo == 0;
    }

	/**
	 * replace all the occurence of 0 in a number by a *
	 * @param number the number to transform
	 * @return a string of {@link number} with * instead of 0
	 */
	public static String replace0(int number) {
		return Arrays.asList(String.valueOf(number).split(""))
			.stream()
			.map(d -> "0".equals(d) ? STAR : d)
			.collect(Collectors.joining());
	}
	
	private static String addString(String s, String add) {
		return !StringUtils.hasLength(s) ? add : s + add;
	}

}
