package com.shypz.shypzbooking;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.shypz.shypzbooking.pojo.User;

public class UserService {
	
	@Autowired        // NO LONGER auto-created by Spring Cloud (see below)
    @LoadBalanced     // Explicitly request the load-balanced template
                      // with Ribbon built-in
    protected RestTemplate restTemplate; 

    protected String serviceUrl;

    public UserService(String serviceUrl) {
        this.serviceUrl = serviceUrl.startsWith("http") ?
               serviceUrl : "http://" + serviceUrl;
    }
    
    
    public User getUserWithId(long id){
    	
    	String user = restTemplate.getForObject(serviceUrl + "/api/users/id/{id}",String.class, id);
    	User usr=null;
    	JSONParser parser = new JSONParser();
		try {
			JSONObject uobj = (JSONObject) parser.parse(user);
			Gson gson = new Gson();
			usr = gson.fromJson(uobj.get("User").toString(), User.class);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return usr;
    }

}
