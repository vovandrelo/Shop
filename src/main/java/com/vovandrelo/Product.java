package com.vovandrelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@AllArgsConstructor
public class Product {
	private final String title;
	private final int price;
	private final Rating rating;

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
