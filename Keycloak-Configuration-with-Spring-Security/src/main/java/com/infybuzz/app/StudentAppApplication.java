package com.infybuzz.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//@SpringBootApplication
@ComponentScan({"com.infybuzz.controller",
		"com.infybuzz.security"})
//@EntityScan("com.infybuzz.entity")
//@EnableJpaRepositories("com.infybuzz.repository")
@EnableGlobalMethodSecurity(prePostEnabled = true)
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
public class StudentAppApplication {

	public static void main(String[] args) {
		
		/*
		 * BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		 * String password1 = bCryptPasswordEncoder.encode("john123"); String password2
		 * = bCryptPasswordEncoder.encode("sachin123");
		 */
		
		SpringApplication.run(StudentAppApplication.class, args);
	}

}
