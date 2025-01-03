package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.dto.User;
import com.java.mapper.UserMapper;

@Controller
public class ViewController {
	
	@Autowired
	private UserMapper userMapper;

	@RequestMapping("/")
	public String list() {
		List<User> list = userMapper.findAll();
		list.forEach(user -> System.out.println(user));
		return "List";
	}
	
}
