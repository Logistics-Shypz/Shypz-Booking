package com.shypz.shypzbooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.client.RestTemplate;

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
    	
    	return restTemplate.getForObject(serviceUrl + "/users/id/{id}",
				User.class, id);
    }

   

}
