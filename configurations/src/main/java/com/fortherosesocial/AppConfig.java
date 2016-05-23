package com.fortherosesocial;

import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.hateoas.config.EnableEntityLinks;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;



@Configuration
@ComponentScan("com.fortherosesocial")
@EnableWebMvc
@EnableEntityLinks
public class AppConfig extends WebMvcConfigurerAdapter {


}
