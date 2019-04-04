package com.example.demo2;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Test {

	@Resource
	private UserRepository userRepository;

	@PostConstruct
	public void test() {

		User u = new User();
		u.setId(3L);
		u.setName("u1");
		userRepository.save(u);
	}

}
