package com.iamvtn.maven.persistence.dao.impl;

import com.iamvtn.maven.model.domain.Hello;
import com.iamvtn.maven.persistence.dao.HelloDao;

public class HelloDaoImpl implements HelloDao {

	public Hello sayHello() {
		Hello hello = new Hello();
		hello.setSayHello("Hello");
		return hello;
	}
}
