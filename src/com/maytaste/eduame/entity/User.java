package com.maytaste.eduame.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
