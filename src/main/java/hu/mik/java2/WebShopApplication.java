package hu.mik.java2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableAutoConfiguration
@EnableWebMvc
@ServletComponentScan
@ComponentScan
@SpringBootApplication
public class WebShopApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(WebShopApplication.class, args);
	}
}
