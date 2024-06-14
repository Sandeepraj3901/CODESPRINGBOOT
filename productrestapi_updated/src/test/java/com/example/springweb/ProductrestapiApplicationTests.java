package com.example.springweb;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.example.springweb.entites.products;


@RunWith(SpringRunner.class)
@SpringBootTest
class ProductrestapiApplicationTests {

	private static final String BASE_URL ="http://localhost:8080/products/";
	@Test
	public void testGetProduct() {
		RestTemplate restTemplate = new RestTemplate();
		products prodct = restTemplate.getForObject(BASE_URL+"2",products.class);
		assertNotNull(prodct);
		assertEquals("Iphone",prodct.getName());
	}



}
