package com.yc.yc_spring_boot_starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//spring开始入口  我是一个配置项
@Configuration
@ConditionalOnClass(IYc.class)
@EnableConfigurationProperties(YcProperties.class)
public class YcAppConfig {
	@Bean
	@ConditionalOnMissingBean
	public IYc yc(){
		return new YcImpl();
	}
}
