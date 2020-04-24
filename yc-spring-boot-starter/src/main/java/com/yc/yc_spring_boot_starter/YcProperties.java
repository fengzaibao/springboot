package com.yc.yc_spring_boot_starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="spring.yc")//告知springboot这个类你要自动帮我托管起来
public class YcProperties {
	private String name="yc";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
