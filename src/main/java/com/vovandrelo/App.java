package com.vovandrelo;

import java.util.Arrays;


public class App {
	private static final String[] SMARTPHONES = {"iPhone XR", "Samsung Galaxy Tab A8", "Samsung Galaxy A34", "Oppo A73"};
	private static final String[] COMPUTERS = {"Apple iMac 4.5K 24", "Apple Mac Studio", "iMac 5K 27", "Studio Display"};

	private static int getFakePrice() {
		return (int) (Math.random() * 1000);
	}
	private static Rating getFakeRating() {
		return Rating.values()[(int) (Math.random() * Rating.values().length)];
	}

	public static void main(String[] args) {
		User someUser = new User("vovandrelo", "pass123");
		System.out.println("Welcome, " + someUser.getLogin() + "!");

		Category categoryPhones = new Category("Smartphones");
		System.out.println(categoryPhones.getTitle());
		for (String smartphone: SMARTPHONES) {
			Product someProduct = new Product(smartphone, getFakePrice(), getFakeRating());
			System.out.println(someProduct);
			categoryPhones.addProductToCategory(someProduct);
		}

		Category categoryComputers = new Category("Computers");
		System.out.println(categoryComputers.getTitle());
		for (String computer: COMPUTERS) {
			Product someProduct = new Product(computer, getFakePrice(), getFakeRating());
			System.out.println(someProduct);
			categoryComputers.addProductToCategory(someProduct);
		}

		someUser.getBasket().addProduct(categoryPhones.getProducts()[0]);
		someUser.getBasket().addProduct(categoryComputers.getProducts()[1]);
		System.out.println("Basket: " + Arrays.toString(someUser.getBasket().getProducts()));
		System.out.println("Total price: " + someUser.getBasket().getSummaryPrice());
	}
}
