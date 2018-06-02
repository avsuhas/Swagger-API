package com.suhas.japi.services.v1;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "user")
public class User implements Serializable{
	
	private static final long serialVersionUID = 1l;
	
	@XmlElement(name = "id")
	private String id;
	
	@XmlElement(name = "name")
	private String name;
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
