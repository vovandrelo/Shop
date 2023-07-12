package com.vovandrelo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Basket {
	private static final Logger LOGGER = LoggerFactory.getLogger(Basket.class);
	private Product[] products = new Product[0];
	private int summaryPrice = 0;

	public void addProduct(Product product) {
		LOGGER.info("Add product to basket");
		Product newProduct = new Product(product.getTitle(), product.getPrice(), product.getRating());
		products = Arrays.copyOf(products, products.length + 1);
		products[products.length - 1] = newProduct;
		summaryPrice += product.getPrice();
	}

	public Product[] getProducts() {
		LOGGER.info("Get products of basket");
		return Arrays.copyOf(products, products.length);
	}

	public int getSummaryPrice() {
		LOGGER.info("Get summary basket price");
		return summaryPrice;
	}
}
