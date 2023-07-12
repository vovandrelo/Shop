package com.vovandrelo;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class Category {
	@Getter
	private final String title;
	private Product[] products = new Product[0];

	public Category(String title) {
		log.info("Create category");
		this.title = title;
	}

	public void addProductToCategory(Product product) {
		log.info("Add product to category");
		Product newProduct = new Product(product.getTitle(), product.getPrice(), product.getRating());
		products = Arrays.copyOf(products, products.length + 1);
		products[products.length - 1] = newProduct;
	}

	public Product[] getProducts() {
		log.info("Get products of category");
		return Arrays.copyOf(products, products.length);
	}
}
