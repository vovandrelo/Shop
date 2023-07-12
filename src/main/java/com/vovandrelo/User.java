package com.vovandrelo;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class User {
	@Getter
	private final String login;
	@Getter
	private final Basket basket = new Basket();
	private String pass;

	public User(String login, String pass) {
		log.info("Create user");
		this.login = login;
		this.pass = pass;
	}
}
