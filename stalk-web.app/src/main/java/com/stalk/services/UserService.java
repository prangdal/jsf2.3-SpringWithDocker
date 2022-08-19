package com.stalk.services;

import jakarta.inject.Named;

@Named("userService")
public class UserService {
    
	
	public String getName() {
        return "Pradeep Rangdal";
    }
}
