package com.suhas.japi.services.v1;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "users")

public class UsersHolder {
	
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "users")
	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
