package com.training.bean;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.training.interfaces.MyProfile;



@Component
@Profile("prod")
public class ProdProfile implements MyProfile {

	@Override
	public void process() {
		
		System.out.println("This is Production Profile");

	}

}
