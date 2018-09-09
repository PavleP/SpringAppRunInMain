package com.learn.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.learn.components.ComponentsMarker;

@Configuration
@ComponentScan(basePackageClasses = {ComponentsMarker.class})
public class Config {


}
