package com.fxc.rest.service;

/**
 * Service to transform a number with FooBarQix Rules
 * @author fxchassagne
 *
 */
public interface FooBarQixService {
	
	/**
	 * Rules
	 * If the number is divisible by 3, write “Foo” instead of the number
	 * If the number is divisible by 5, add “Bar”
	 * If the number is divisible by 7, add “Qix”
	 * For each digit 3, 5, 7, add “Foo”, “Bar”, “Qix” in the digits order.
	 * @param number the number to transform
	 * @return the string of the number transformed
	 */
	String computeString(Integer number);

	/**
	 * Rule V1 +
	 * we must keep a trace of 0 in numbers, each 0 must be replaced by char “*“.
	 * @param number the number to transform
	 * @return the string of the number transformed
	 */
	String computeStringV2(Integer number);
}
