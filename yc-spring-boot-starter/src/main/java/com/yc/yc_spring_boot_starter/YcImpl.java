package com.yc.yc_spring_boot_starter;

import org.springframework.beans.factory.annotation.Autowired;

public class YcImpl implements IYc {
	@Autowired
	private YcProperties ycProperties;
	
	@Override
	public void sayHello() {
		String name=ycProperties.getName();
		System.out.println("say Hello:"+name);
		

	}

}
