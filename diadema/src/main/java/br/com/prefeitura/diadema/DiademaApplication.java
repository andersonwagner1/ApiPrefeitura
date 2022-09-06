package br.com.prefeitura.diadema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//@SpringBootApplication(
@SpringBootApplication(exclude={SecurityAutoConfiguration.class}) //desbiiltar a segurança
//@SpringBootApplication(exclude={SecurityConfiguration.class}) //desbiiltar a segurança

public class DiademaApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(DiademaApplication.class, args);
	}

}
