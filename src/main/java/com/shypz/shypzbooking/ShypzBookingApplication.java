package com.shypz.shypzbooking;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.shypz.shypzbooking.pojo.User;
import org.slf4j.Logger;

@SpringBootApplication
@EnableDiscoveryClient
public class ShypzBookingApplication {

	
	public static final String USER_SERVICE_URL = "http://USERS-MICROSERVICE";
	public static final String ITEMS_SERVICE_URL = "http://ITEMS-MICROSERVICE";
	
	private static final Logger log = LoggerFactory.getLogger(ShypzBookingApplication.class);

	
	public static void main(String[] args) {
		SpringApplication.run(ShypzBookingApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	
	@Bean
	public UserService userService(){
		return new UserService(USER_SERVICE_URL);
	}
	
	/*@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			User user = restTemplate.getForObject(
					"http://localhost:8080/users/id/1",User.class);
			
			log.info(user.toString());
			
		};
	}*/
	
	
	
}
