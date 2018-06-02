package com.suhas.japi;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.suhas.japi.services.v1.User;

public class BusinessManager {

	private static final Logger log = Logger.getLogger(BusinessManager.class.getName());
	private static BusinessManager INSTANCE = new BusinessManager();

	public static BusinessManager getInstance() {
		return INSTANCE;
	}

	public User findUser(String userId) {

		log.info("BusinessManager::findUser started");
		User user = new User();
		user.setId("112233");
		user.setName("Tom Jay");
		return user;

	}

	public List<User> findUsers() {
		List<User> users = new ArrayList<User>();

		User user1 = new User();
		user1.setId("112233");
		user1.setName("Tom Jay");

		User user2 = new User();
		user2.setId("332211");
		user2.setName("Fred Jay");

		users.add(user1);
		users.add(user2);

		return users;

	}

	public User addUser(User user) {

		user.setId("112233");

		return user;

	}

	public User updateUserAttribute(String userId, String attribute, String value) {

		User user = new User();

		user.setId(userId);

		if (attribute.equals("name")) {
			user.setName("Tom Jay");
		}

		return user;
	}

	public void deleteUser(String userId) {

		return;

	}

}
