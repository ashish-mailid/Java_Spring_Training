package com.training.bean;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.training.interfaces.MyProfile;


@Component
@Profile("dev")
public class DevProfile implements MyProfile {

	@Override
	public void process() {
		
		System.out.println("This is Dev Profile");

	}

}
