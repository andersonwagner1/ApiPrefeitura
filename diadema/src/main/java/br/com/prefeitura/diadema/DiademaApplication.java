package br.com.prefeitura.diadema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//@SpringBootApplication(
@SpringBootApplication(exclude={SecurityAutoConfiguration.class}) //desbiiltar a segurança
public class DiademaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiademaApplication.class, args);
	}

}
