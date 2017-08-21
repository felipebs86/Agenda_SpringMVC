package br.com.fbscorp.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("br.com.fbscorp.spring")
@EnableWebMvc
public class RootConfig {
	
}
