package com.example.demo;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.request.Product;
import com.example.demo.request.PromotionsRequest;
import com.example.demo.response.Promotions;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class PromotionsApplicationTests {
	
	@Autowired
	TestRestTemplate restTemplate = new TestRestTemplate();
	
	@LocalServerPort
    int randomServerPort;

	@Test
	public void rule1() throws URISyntaxException, JSONException {
		PromotionsRequest request = new PromotionsRequest();
		ResponseEntity<Promotions[]> response = restTemplate.postForEntity(new URI("http://localhost:"+randomServerPort+"/api/promotions"), request, Promotions[].class);
		Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		Promotions[] promotions = response.getBody();
		for (Promotions promotions2 : promotions) {
			if(promotions2.getId().equals("X")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(0);
			}else if (promotions2.getId().equals("Y")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(0);
			}
		}
	}
	
	@Test
	public void rule2() throws URISyntaxException, JSONException {
		PromotionsRequest request = new PromotionsRequest();
		Product product1 = new Product();
		product1.setId("D");
		List<Product> list = new ArrayList<Product>();
		list.add(product1);
		request.setProducts(list);
		ResponseEntity<Promotions[]> response = restTemplate.postForEntity(new URI("http://localhost:"+randomServerPort+"/api/promotions"), request, Promotions[].class);
		Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		Promotions[] promotions = response.getBody();
		for (Promotions promotions2 : promotions) {
			if(promotions2.getId().equals("X")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(0);
			}else if (promotions2.getId().equals("Y")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(0);
			}
		}
	}
	
	@Test
	public void rule3() throws URISyntaxException, JSONException {
		PromotionsRequest request = new PromotionsRequest();
		Product product1 = new Product();
		product1.setId("D");
		Product product2 = new Product();
		product2.setId("D");
		List<Product> list = new ArrayList<Product>();
		list.add(product1);
		list.add(product2);
		request.setProducts(list);
		ResponseEntity<Promotions[]> response = restTemplate.postForEntity(new URI("http://localhost:"+randomServerPort+"/api/promotions"), request, Promotions[].class);
		Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		Promotions[] promotions = response.getBody();
		for (Promotions promotions2 : promotions) {
			if(promotions2.getId().equals("X")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(0);
			}else if (promotions2.getId().equals("Y")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(0);
			}
		}
	}
	
	@Test
	public void rule4() throws URISyntaxException, JSONException {
		PromotionsRequest request = new PromotionsRequest();
		Product product1 = new Product();
		product1.setId("B");
		List<Product> list = new ArrayList<Product>();
		list.add(product1);
		request.setProducts(list);
		ResponseEntity<Promotions[]> response = restTemplate.postForEntity(new URI("http://localhost:"+randomServerPort+"/api/promotions"), request, Promotions[].class);
		Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		Promotions[] promotions = response.getBody();
		for (Promotions promotions2 : promotions) {
			if(promotions2.getId().equals("X")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(0);
			}else if (promotions2.getId().equals("Y")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(0);
			}
		}
	}
	
	@Test
	public void rule5() throws URISyntaxException, JSONException {
		PromotionsRequest request = new PromotionsRequest();
		Product product1 = new Product();
		product1.setId("B");
		Product product2 = new Product();
		product2.setId("D");
		List<Product> list = new ArrayList<Product>();
		list.add(product1);
		list.add(product2);
		request.setProducts(list);
		ResponseEntity<Promotions[]> response = restTemplate.postForEntity(new URI("http://localhost:"+randomServerPort+"/api/promotions"), request, Promotions[].class);
		Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		Promotions[] promotions = response.getBody();
		for (Promotions promotions2 : promotions) {
			if(promotions2.getId().equals("X")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(0);
			}else if (promotions2.getId().equals("Y")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(0);
			}
		}
	}
	
	@Test
	public void rule6() throws URISyntaxException, JSONException {
		PromotionsRequest request = new PromotionsRequest();
		Product product1 = new Product();
		product1.setId("B");
		Product product2 = new Product();
		product2.setId("D");
		Product product3 = new Product();
		product3.setId("D");
		List<Product> list = new ArrayList<Product>();
		list.add(product1);
		list.add(product2);
		list.add(product3);
		request.setProducts(list);
		ResponseEntity<Promotions[]> response = restTemplate.postForEntity(new URI("http://localhost:"+randomServerPort+"/api/promotions"), request, Promotions[].class);
		Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		Promotions[] promotions = response.getBody();
		for (Promotions promotions2 : promotions) {
			if(promotions2.getId().equals("X")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(0);
			}else if (promotions2.getId().equals("Y")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(0);
			}
		}
	}
	
	@Test
	public void rule7() throws URISyntaxException, JSONException {
		PromotionsRequest request = new PromotionsRequest();
		Product product1 = new Product();
		product1.setId("B");
		Product product2 = new Product();
		product2.setId("B");
		List<Product> list = new ArrayList<Product>();
		list.add(product1);
		list.add(product2);
		request.setProducts(list);
		int bcc = 0;
		for (Product product : list) {
			if(product.getId().equals("B") || product.getId().equals("c")) {
				++bcc;
			}
		}
		ResponseEntity<Promotions[]> response = restTemplate.postForEntity(new URI("http://localhost:"+randomServerPort+"/api/promotions"), request, Promotions[].class);
		Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		Promotions[] promotions = response.getBody();
		for (Promotions promotions2 : promotions) {
			if(promotions2.getId().equals("X")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(bcc);
			}else if (promotions2.getId().equals("Y")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(0);
			}
		}
	}
	
	@Test
	public void rule8() throws URISyntaxException, JSONException {
		PromotionsRequest request = new PromotionsRequest();
		Product product1 = new Product();
		product1.setId("B");
		Product product2 = new Product();
		product2.setId("B");
		Product product3 = new Product();
		product3.setId("D");
		List<Product> list = new ArrayList<Product>();
		list.add(product1);
		list.add(product2);
		list.add(product3);
		request.setProducts(list);
		int bcc = 0;
		for (Product product : list) {
			if(product.getId().equals("B") || product.getId().equals("c")) {
				++bcc;
			}
		}
		ResponseEntity<Promotions[]> response = restTemplate.postForEntity(new URI("http://localhost:"+randomServerPort+"/api/promotions"), request, Promotions[].class);
		Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		Promotions[] promotions = response.getBody();
		for (Promotions promotions2 : promotions) {
			if(promotions2.getId().equals("X")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(bcc);
			}else if (promotions2.getId().equals("Y")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(0);
			}
		}
	}
	
	@Test
	public void rule9() throws URISyntaxException, JSONException {
		PromotionsRequest request = new PromotionsRequest();
		Product product1 = new Product();
		product1.setId("B");
		Product product2 = new Product();
		product2.setId("B");
		Product product3 = new Product();
		product3.setId("D");
		Product product4 = new Product();
		product4.setId("D");
		List<Product> list = new ArrayList<Product>();
		list.add(product1);
		list.add(product2);
		list.add(product3);
		list.add(product4);
		request.setProducts(list);
		int bcc = 0;
		for (Product product : list) {
			if(product.getId().equals("B") || product.getId().equals("c")) {
				++bcc;
			}
		}
		ResponseEntity<Promotions[]> response = restTemplate.postForEntity(new URI("http://localhost:"+randomServerPort+"/api/promotions"), request, Promotions[].class);
		Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		Promotions[] promotions = response.getBody();
		for (Promotions promotions2 : promotions) {
			if(promotions2.getId().equals("X")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(bcc);
			}else if (promotions2.getId().equals("Y")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(0);
			}
		}
	}
	
	@Test
	public void rule10() throws URISyntaxException, JSONException {
		PromotionsRequest request = new PromotionsRequest();
		Product product1 = new Product();
		product1.setId("A");
		List<Product> list = new ArrayList<Product>();
		list.add(product1);
		request.setProducts(list);
		ResponseEntity<Promotions[]> response = restTemplate.postForEntity(new URI("http://localhost:"+randomServerPort+"/api/promotions"), request, Promotions[].class);
		Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		Promotions[] promotions = response.getBody();
		for (Promotions promotions2 : promotions) {
			if(promotions2.getId().equals("X")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(0);
			}else if (promotions2.getId().equals("Y")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(0);
			}
		}
	}
	
	@Test
	public void rule11() throws URISyntaxException, JSONException {
		PromotionsRequest request = new PromotionsRequest();
		Product product1 = new Product();
		product1.setId("A");
		Product product2 = new Product();
		product2.setId("D");
		List<Product> list = new ArrayList<Product>();
		list.add(product1);
		list.add(product2);
		request.setProducts(list);
		ResponseEntity<Promotions[]> response = restTemplate.postForEntity(new URI("http://localhost:"+randomServerPort+"/api/promotions"), request, Promotions[].class);
		Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		Promotions[] promotions = response.getBody();
		for (Promotions promotions2 : promotions) {
			if(promotions2.getId().equals("X")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(0);
			}else if (promotions2.getId().equals("Y")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(1);
			}
		}
	}
	
	@Test
	public void rule12() throws URISyntaxException, JSONException {
		PromotionsRequest request = new PromotionsRequest();
		Product product1 = new Product();
		product1.setId("A");
		Product product2 = new Product();
		product2.setId("D");
		Product product3 = new Product();
		product3.setId("D");
		List<Product> list = new ArrayList<Product>();
		list.add(product1);
		list.add(product2);
		list.add(product3);
		request.setProducts(list);
		int dc = 0;
		for (Product product : list) {
			if(product.getId().equals("D")) {
				++dc;
			}
		}
		ResponseEntity<Promotions[]> response = restTemplate.postForEntity(new URI("http://localhost:"+randomServerPort+"/api/promotions"), request, Promotions[].class);
		Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		Promotions[] promotions = response.getBody();
		for (Promotions promotions2 : promotions) {
			if(promotions2.getId().equals("X")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(0);
			}else if (promotions2.getId().equals("Y")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(dc);
			}
		}
	}
	
	@Test
	public void rule13() throws URISyntaxException, JSONException {
		PromotionsRequest request = new PromotionsRequest();
		Product product1 = new Product();
		product1.setId("A");
		Product product2 = new Product();
		product2.setId("B");
		List<Product> list = new ArrayList<Product>();
		list.add(product1);
		list.add(product2);
		request.setProducts(list);
		ResponseEntity<Promotions[]> response = restTemplate.postForEntity(new URI("http://localhost:"+randomServerPort+"/api/promotions"), request, Promotions[].class);
		Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		Promotions[] promotions = response.getBody();
		for (Promotions promotions2 : promotions) {
			if(promotions2.getId().equals("X")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(1);
			}else if (promotions2.getId().equals("Y")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(0);
			}
		}
	}
	
	@Test
	public void rule14() throws URISyntaxException, JSONException {
		PromotionsRequest request = new PromotionsRequest();
		Product product1 = new Product();
		product1.setId("A");
		Product product2 = new Product();
		product2.setId("B");
		Product product3 = new Product();
		product3.setId("D");
		List<Product> list = new ArrayList<Product>();
		list.add(product1);
		list.add(product2);
		list.add(product3);
		request.setProducts(list);
		ResponseEntity<Promotions[]> response = restTemplate.postForEntity(new URI("http://localhost:"+randomServerPort+"/api/promotions"), request, Promotions[].class);
		Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		Promotions[] promotions = response.getBody();
		for (Promotions promotions2 : promotions) {
			if(promotions2.getId().equals("X")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(1);
			}else if (promotions2.getId().equals("Y")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(1);
			}
		}
	}
	
	@Test
	public void rule15() throws URISyntaxException, JSONException {
		PromotionsRequest request = new PromotionsRequest();
		Product product1 = new Product();
		product1.setId("A");
		Product product2 = new Product();
		product2.setId("B");
		Product product3 = new Product();
		product3.setId("D");
		Product product4 = new Product();
		product4.setId("D");
		List<Product> list = new ArrayList<Product>();
		list.add(product1);
		list.add(product2);
		list.add(product3);
		list.add(product4);
		request.setProducts(list);
		int dc = 0;
		for (Product product : list) {
			if(product.getId().equals("D")) {
				++dc;
			}
		}
		ResponseEntity<Promotions[]> response = restTemplate.postForEntity(new URI("http://localhost:"+randomServerPort+"/api/promotions"), request, Promotions[].class);
		Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		Promotions[] promotions = response.getBody();
		for (Promotions promotions2 : promotions) {
			if(promotions2.getId().equals("X")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(1);
			}else if (promotions2.getId().equals("Y")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(dc);
			}
		}
	}
	
	@Test
	public void rule16() throws URISyntaxException, JSONException {
		PromotionsRequest request = new PromotionsRequest();
		Product product1 = new Product();
		product1.setId("A");
		Product product2 = new Product();
		product2.setId("B");
		Product product3 = new Product();
		product3.setId("B");
		List<Product> list = new ArrayList<Product>();
		list.add(product1);
		list.add(product2);
		list.add(product3);
		request.setProducts(list);
		int bcc = 0;
		for (Product product : list) {
			if(product.getId().equals("B") || product.getId().equals("c")) {
				++bcc;
			}
		}
		ResponseEntity<Promotions[]> response = restTemplate.postForEntity(new URI("http://localhost:"+randomServerPort+"/api/promotions"), request, Promotions[].class);
		Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		Promotions[] promotions = response.getBody();
		for (Promotions promotions2 : promotions) {
			if(promotions2.getId().equals("X")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(bcc);
			}else if (promotions2.getId().equals("Y")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(0);
			}
		}
	}
	
	@Test
	public void rule17() throws URISyntaxException, JSONException {
		PromotionsRequest request = new PromotionsRequest();
		Product product1 = new Product();
		product1.setId("A");
		Product product2 = new Product();
		product2.setId("B");
		Product product3 = new Product();
		product3.setId("B");
		Product product4 = new Product();
		product4.setId("D");
		List<Product> list = new ArrayList<Product>();
		list.add(product1);
		list.add(product2);
		list.add(product3);
		list.add(product4);
		request.setProducts(list);
		int bcc = 0;
		for (Product product : list) {
			if(product.getId().equals("B") || product.getId().equals("c")) {
				++bcc;
			}
		}
		ResponseEntity<Promotions[]> response = restTemplate.postForEntity(new URI("http://localhost:"+randomServerPort+"/api/promotions"), request, Promotions[].class);
		Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		Promotions[] promotions = response.getBody();
		for (Promotions promotions2 : promotions) {
			if(promotions2.getId().equals("X")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(bcc);
			}else if (promotions2.getId().equals("Y")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(1);
			}
		}
	}
	
	@Test
	public void rule18() throws URISyntaxException, JSONException {
		PromotionsRequest request = new PromotionsRequest();
		Product product1 = new Product();
		product1.setId("A");
		Product product2 = new Product();
		product2.setId("B");
		Product product3 = new Product();
		product3.setId("B");
		Product product4 = new Product();
		product4.setId("D");
		Product product5 = new Product();
		product5.setId("D");
		List<Product> list = new ArrayList<Product>();
		list.add(product1);
		list.add(product2);
		list.add(product3);
		list.add(product4);
		list.add(product5);
		request.setProducts(list);
		int bcc = 0;
		int dc = 0;
		for (Product product : list) {
			if(product.getId().equals("B") || product.getId().equals("c")) {
				++bcc;
			}
			if(product.getId().equals("D")) {
				++dc;
			}
		}
		ResponseEntity<Promotions[]> response = restTemplate.postForEntity(new URI("http://localhost:"+randomServerPort+"/api/promotions"), request, Promotions[].class);
		Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		Promotions[] promotions = response.getBody();
		for (Promotions promotions2 : promotions) {
			if(promotions2.getId().equals("X")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(bcc);
			}else if (promotions2.getId().equals("Y")) {
				Assertions.assertThat(promotions2.getQuantity()).isEqualTo(dc);
			}
		}
	}

}
