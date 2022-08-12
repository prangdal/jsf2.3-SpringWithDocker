package com.stalk.web.application.view;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("view")
public class OtherBean {
	public OtherBean() {
		System.out.println("Other bean Created!");
	}

	public String getFrom() {
		return this.toString();
	}

	public String getDate() {
		return new Date().toString();
	}
}
