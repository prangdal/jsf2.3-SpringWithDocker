package com.stalk.web.jsf.beans;

import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stalk.services.UserService;

@Named
@RequestScoped
public class MyBean {

	@Inject
	private UserService userService ;
	
	public MyBean() {
		System.out.println("-------------------- Created! v2 -------------------- ");
	}

	public String getFrom() {
		return userService.getUser();
	}

	public String getDate() {
		return new Date().toString();
	}
}
