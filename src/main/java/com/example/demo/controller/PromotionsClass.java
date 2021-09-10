package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.request.Product;
import com.example.demo.request.PromotionsRequest;
import com.example.demo.response.Promotions;
import com.example.demo.response.PromotionsErrorClass;
import com.example.demo.response.PromotionsResponse;

@RestController
@RequestMapping("/api")
public class PromotionsClass {
	
	
	@PostMapping("/promotions")
	public ResponseEntity<?> promotions(@RequestBody PromotionsRequest request) {
		int ac = 0;
		int bcc = 0;
		int dc = 0;
		if(request.getProducts() != null) {
			for (Product product : request.getProducts()) {
				if(product.getId().equals("A")) {
					++ac;
				}
				if (product.getId().equals("B") || product.getId().equals("C")) {
					++bcc;
				}
				if (product.getId().equals("D")) {
					++dc;
				}
			}
		}
		
		if(ac>1) {
			PromotionsErrorClass error = new PromotionsErrorClass();
			error.setErrorCode("400");
			error.setErrorMessage("Product A should not be more than one, please check request once");
			return new ResponseEntity<PromotionsErrorClass>(error, HttpStatus.BAD_REQUEST);
		}
		
		Promotions promotions1 = new Promotions();
		promotions1.setId("X");
		promotions1.setQuantity(0);
		Promotions promotions2 = new Promotions();
		promotions2.setId("Y");
		promotions2.setQuantity(0);
		List<Promotions> promos = new ArrayList<>();
		
		if(ac == 0) {
			if(bcc == 0) {
				if(dc == 0) {
					promotions1.setQuantity(0);
					promotions2.setQuantity(0);
				}else if (dc == 1) {
					promotions1.setQuantity(0);
					promotions2.setQuantity(0);
				}else {
					promotions1.setQuantity(0);
					promotions2.setQuantity(0);
				}
			}else if (bcc == 1) {
				if(dc == 0) {
					promotions1.setQuantity(0);
					promotions2.setQuantity(0);
				}else if (dc == 1) {
					promotions1.setQuantity(0);
					promotions2.setQuantity(0);
				}else {
					promotions1.setQuantity(0);
					promotions2.setQuantity(0);
				}
			} else {
				if(dc == 0) {
					promotions1.setQuantity(bcc);
					promotions2.setQuantity(0);
				}else if (dc == 1) {
					promotions1.setQuantity(bcc);
					promotions2.setQuantity(0);
				}else {
					promotions1.setQuantity(bcc);
					promotions2.setQuantity(0);
				}
			}
		}else {
			if(bcc == 0) {
				if(dc == 0) {
					promotions1.setQuantity(0);
					promotions2.setQuantity(0);
				}else if (dc == 1) {
					promotions1.setQuantity(0);
					promotions2.setQuantity(1);
				}else {
					promotions1.setQuantity(0);
					promotions2.setQuantity(dc);
				}
			}else if (bcc == 1) {
				if(dc == 0) {
					promotions1.setQuantity(1);
					promotions2.setQuantity(0);
				}else if (dc == 1) {
					promotions1.setQuantity(1);
					promotions2.setQuantity(1);
				}else {
					promotions1.setQuantity(1);
					promotions2.setQuantity(dc);
				}
			} else {
				if(dc == 0) {
					promotions1.setQuantity(bcc);
					promotions2.setQuantity(0);
				}else if (dc == 1) {
					promotions1.setQuantity(bcc);
					promotions2.setQuantity(1);
				}else {
					promotions1.setQuantity(bcc);
					promotions2.setQuantity(dc);
				}
			}
		}
		
		promos.add(promotions1);
		promos.add(promotions2);
		PromotionsResponse response = new PromotionsResponse();
		response.setPromotions(promos);
		return new ResponseEntity<List<Promotions>>(promos, HttpStatus.OK);
		
	}
	
}
