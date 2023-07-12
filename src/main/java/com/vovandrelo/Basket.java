package com.vovandrelo;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

@Slf4j
public class Basket {
	private Product[] products = new Product[0];
	@Getter private int summaryPrice = 0;

	public void addProduct(Product product) {
		log.info("Add product to basket");
		Product newProduct = new Product(product.getTitle(), product.getPrice(), product.getRating());
		products = Arrays.copyOf(products, products.length + 1);
		products[products.length - 1] = newProduct;
		summaryPrice += product.getPrice();
	}

	public Product[] getProducts() {
		log.info("Get products of basket");
		return Arrays.copyOf(products, products.length);
	}
}
