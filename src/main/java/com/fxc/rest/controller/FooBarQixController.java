package com.fxc.rest.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fxc.rest.service.FooBarQixService;
import com.fxc.rest.common.EndpointsUtils;

/**
 * Controller for FooBarQix Kata
 * @author fxchassagne
 *
 */
@RestController
@RequestMapping(EndpointsUtils.BASE_API + "/foobarqix")
public class FooBarQixController {

	private static final Integer MAX = 250;
	
	@Autowired
	FooBarQixService fooBarQixService;

	/**
	 * get all firsts numbers (until a MAX) transformed by the FooBarQix rule
	 * @return a map of a numbers and its FooBarQix value
	 */
	@GetMapping("/v1")
	public ResponseEntity<Map<Integer, String>> getFirstString() {
		Map<Integer, String> result = new HashMap<>();
		
		for(int i = 0; i < MAX; i++) {
			result.put(i, fooBarQixService.computeString(i));
		}
		
		return new ResponseEntity<Map<Integer, String>>(result, HttpStatus.OK);
	}
	
	/**
	 * get the transformation of a {@link number} following the FooBarQix rule
	 * @param number the number to transform
	 * @return the string resulting of the transformation
	 */
	@GetMapping("/v1/{number}")
	public ResponseEntity<String> getString(@PathVariable("number") int number) {
		String result = fooBarQixService.computeString(number); 
		return new ResponseEntity<String>(result, HttpStatus.OK);
	}
	
	/**
	 * get all firsts numbers (until a MAX) transformed by the FooBarQix V2 rule
	 * @return a map of a numbers and its FooBarQix V2 value
	 */
	@GetMapping("/v2")
	public ResponseEntity<Map<Integer, String>> getFirstStringV2() {
		Map<Integer, String> result = new HashMap<>();
		
		for(int i = 0; i < MAX; i++) {
			result.put(i, fooBarQixService.computeStringV2(i));
		}
		
		return new ResponseEntity<Map<Integer, String>>(result, HttpStatus.OK);
	}
	
	/**
	 * get the transformation of a {@link number} following the FooBarQix V2 rule
	 * @param number the number to transform
	 * @return the string resulting of the transformation
	 */
	@GetMapping("/v2/{number}")
	public ResponseEntity<String> getStringV2(@PathVariable("number") int number) {
		return new ResponseEntity<String>(fooBarQixService.computeStringV2(number), HttpStatus.OK);
	}
}
