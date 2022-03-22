package com.example.Junitsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JunitsampleApplication {
	@RequestMapping("/add")
	public int  add()
	{
		int i=12;
		int j=16;
		
		return i+j;
	}
	@RequestMapping("/mul")
	public int mul() {
		int c=2; int d=3;
		return c*d;
	}

	public static void main(String[] args) {
		SpringApplication.run(JunitsampleApplication.class, args);
		JunitsampleApplication b =new JunitsampleApplication ();
		b.add();
		b.mul();
	}

}
