package com.example.demo.controller;


import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;

@RestController
@RequestMapping("/rest/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/add")
    public void add(@RequestBody String requestBody){
    	requestBody = requestBody.trim();
		JSONObject jsonObject = new JSONObject(requestBody);
		
		String id = jsonObject.getString("id");
		String name = jsonObject.getString("name");
		
		userRepository.save(new User(id,name,2000L));
	
	
    }

    @PostMapping("/update")
    public void update(@RequestBody String requestBody) throws Exception{
    	requestBody = requestBody.trim();
		JSONObject jsonObject = new JSONObject(requestBody);
		
		String id = jsonObject.getString("id");
		String name = jsonObject.getString("name");
		
        userRepository.save(new User(id, name, 1000L));
    }

    @GetMapping("/all")
    public Map<String, User> all(){
    	
        return userRepository.findAll();
    }
    
    @PostMapping("/delete")
	public void deleteUser(@RequestBody String requestBody) {
		requestBody = requestBody.trim();
		JSONObject jsonObject = new JSONObject(requestBody);
		
		String id = jsonObject.getString("id");
		
		userRepository.delete(id);
	}
}

