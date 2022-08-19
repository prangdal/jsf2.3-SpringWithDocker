package com.stalk.web.jsf.beans;

import java.util.Date;

import com.stalk.services.UserService;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@RequestScoped
public class Hello {

	@Inject
	private UserService userService ;
	
	public Hello() {
		System.out.println("-------------------- Created! v2 -------------------- ");
	}

	public String getName() {
		System.out.println("\n\n\n got it.. in conroller.");
		return userService.getName();
	}

	public String getDate() {
		return new Date().toString();
	}
}
