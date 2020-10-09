package com.yang.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan(basePackages = {"com.yang"})
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class MyConfig {

}
