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

import com.google.gson.Gson;
import com.google.gson.JsonDeserializer;
import com.shypz.shypzbooking.pojo.User;
import com.shypz.shypzbooking.pojo.UserJSONResponse;

import java.util.HashSet;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;

@SpringBootApplication
@EnableDiscoveryClient
public class ShypzBookingApplication {
	
	private static final Logger log = LoggerFactory.getLogger(ShypzBookingApplication.class);
	
	public static final String USER_SERVICE_URL = "http://USERS-MICROSERVICE";
	//public static final String ITEMS_SERVICE_URL = "http://localhost:8082";
	
	
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
	
	
	/*
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			
			String s = restTemplate.getForObject("http://localhost:8080/api/users/id/1",String.class);
			
			JSONParser parser = new JSONParser();
			JSONObject jobj = (JSONObject) parser.parse(s);
			
			System.out.println(jobj.get("User"));
			
			Object u = jobj.get("User");
			
			
			
			JSONArray array = new JSONArray();
			array.add(u);
			//System.out.println(array.size());
			
			JSONObject jsonObjectRow = (JSONObject) array.get(0);
			
			Gson gson = new Gson();
			User usr = gson.fromJson(jobj.get("User").toString(), User.class);
			System.out.println(usr.getId());
			System.out.println(usr.getUser_Mobile());
			System.out.println(usr.getAddress().get(0).getAddressCity());
			
			
			
		};
	}
	*/
	
	
}
