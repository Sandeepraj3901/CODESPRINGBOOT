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
		products prodct = restTemplate.getForObject(BASE_URL+"10",products.class);
		assertNotNull(prodct);
		assertEquals("Raj",prodct.getName());
	}
	@Test
	public void testPutProduct() {
		RestTemplate restTemplate = new RestTemplate();
		products product = new products();
		product.setName("Pothula");
		product.setDescription("Khiladi");
		product.setPrice(1200);
		products response = restTemplate.postForObject("http://localhost:8080/products/",product,products.class);
		assertNotNull(response);
		assertNotNull(response.getId());
		assertEquals("Pothula",response.getName());
	}
	@Test
	public void testUpdateProduct()
	{
		RestTemplate restTemplate = new RestTemplate();
		products p = restTemplate.getForObject(BASE_URL+"9", products.class);
		p.setPrice(999);
		restTemplate.put(BASE_URL,p);
	}

}
