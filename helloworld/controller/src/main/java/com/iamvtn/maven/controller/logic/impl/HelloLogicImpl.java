package com.iamvtn.maven.controller.logic.impl;

import com.iamvtn.maven.controller.logic.HelloLogic;
import com.iamvtn.maven.model.domain.Hello;
import com.iamvtn.maven.persistence.dao.HelloDao;
import com.iamvtn.maven.persistence.dao.impl.HelloDaoImpl;

public class HelloLogicImpl implements HelloLogic {

	public String sayHello() {
		Hello hello = new Hello();
		HelloDao helloDao = new HelloDaoImpl();
		hello = helloDao.sayHello();
		String sayHello = hello.getSayHello();
		return sayHello;
	}

}
