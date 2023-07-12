package com.vovandrelo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Product {
	private static final Logger LOGGER = LoggerFactory.getLogger(Product.class);
	private final String title;
	private final int price;
	private final Rating rating;
	public Product(String title, int price, Rating rating) {
		LOGGER.info("Create product");
		this.title = title;
		this.price = price;
		this.rating = rating;
	}

	public String getTitle() {
		LOGGER.info("Get product title");
		return title;
	}

	public int getPrice() {
		LOGGER.info("Get product price");
		return price;
	}

	public Rating getRating() {
		LOGGER.info("Get product rating");
		return rating;
	}

	@Override
	public String toString() {
		return "Product - {" + title + ", price=" + price + ", rating=" + rating + '}';
	}
}

enum Rating {
	ONE_STAR,
	TWO_STAR,
	THREE_STAR,
	FOUR_STAR,
	FIVE_STAR,
}
