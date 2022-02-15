package com.fxc.rest.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.fxc.rest.service.FooBarQixService;

@ExtendWith(MockitoExtension.class)
public class FooBarQixControllerTest {

	@InjectMocks
	private FooBarQixController fooBarQicController;
	
	@Mock
	FooBarQixService fooBarQixService;
	
	@Test
	public void getFirstStringTest() {
		when(fooBarQixService.computeString(Mockito.any())).thenReturn("FooBarQix");
		ResponseEntity<Map<Integer, String>> response = fooBarQicController.getFirstString();
		assertNotNull(response);
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertNotNull(response.getBody());
		assertFalse(response.getBody().isEmpty());
		assertThat(response.getBody().size()).isGreaterThan(0);
		assertThat(response.getBody().get(0)).asString().isNotBlank();
	}
	
	@Test
	public void getStringTest() {
		when(fooBarQixService.computeString(Mockito.any())).thenReturn("FooBarQix");
		ResponseEntity<String> response = fooBarQicController.getString(5);
		assertNotNull(response);
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertNotNull(response.getBody());
		assertFalse(response.getBody().isEmpty());
		assertThat(response.getBody()).asString().isNotBlank();
	}
	
	@Test
	public void getFirstStringV2Test() {
		when(fooBarQixService.computeStringV2(Mockito.anyInt())).thenReturn("FooBarQix");
		ResponseEntity<Map<Integer, String>> response = fooBarQicController.getFirstStringV2();
		assertNotNull(response);
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertNotNull(response.getBody());
		assertFalse(response.getBody().isEmpty());
		assertThat(response.getBody().size()).isGreaterThan(0);
		assertThat(response.getBody().get(0)).asString().isNotBlank();
	}
	
	@Test
	public void getStringV2Test() {
		when(fooBarQixService.computeStringV2(Mockito.anyInt())).thenReturn("FooBarQix");
		ResponseEntity<String> response = fooBarQicController.getStringV2(5);
		assertNotNull(response);
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertNotNull(response.getBody());
		assertFalse(response.getBody().isEmpty());
		assertThat(response.getBody()).asString().isNotBlank();
	}
	
}
