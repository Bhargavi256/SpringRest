package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dao.UserRepository;
import com.entity.User;

@SpringBootApplication
public class SpringBootJpaRest12Application {
 
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootJpaRest12Application.class, args);
		
		User user = new User("hey","chikky",1,"no");
		UserRepository userRepository = applicationContext.getBean("userRepository",UserRepository.class);
		User save = userRepository.save(user);
		System.out.println(save);
	}

}
