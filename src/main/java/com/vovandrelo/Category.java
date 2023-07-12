package com.vovandrelo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Category {
	private static final Logger LOGGER = LoggerFactory.getLogger(Category.class);
	private final String title;
	private Product[] products = new Product[0];

	public Category(String title) {
		LOGGER.info("Create category");
		this.title = title;
	}

	public void addProductToCategory(Product product) {
		LOGGER.info("Add product to category");
		Product newProduct = new Product(product.getTitle(), product.getPrice(), product.getRating());
		products = Arrays.copyOf(products, products.length + 1);
		products[products.length - 1] = newProduct;
	}

	public Product[] getProducts() {
		LOGGER.info("Get products of category");
		return Arrays.copyOf(products, products.length);
	}

	public String getTitle() {
		LOGGER.info("Get category title");
		return title;
	}
}
