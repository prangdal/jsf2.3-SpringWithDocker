package com.stalk.web.application.view;

import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.ManagedProperty;
import javax.inject.Inject;
import javax.inject.Named;

import com.stalk.services.UserService;

@Named
@RequestScoped
public class MyBean {

	@Inject
	@ManagedProperty (value = "#{userService}")
	private UserService userService ;
	
	public MyBean() {
		System.out.println("Created! v2");
	}

	public String getFrom() {
		return userService.getUser();
	}

	public String getDate() {
		return new Date().toString();
	}
}
