package com.vovandrelo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User {
	private static final Logger LOGGER = LoggerFactory.getLogger(User.class);
	private final String login;
	private String pass;
	private final Basket basket = new Basket();

	public User(String login, String pass) {
		LOGGER.info("Create user");
		this.login = login;
		this.pass = pass;
	}

	public String getLogin() {
		LOGGER.info("Get user login");
		return login;
	}

	public Basket getBasket() {
		LOGGER.info("Get user pass");
		return basket;
	}
}
