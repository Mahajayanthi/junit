package com.example.Junitsample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


	@RestController
	public class Democlass {
		@RequestMapping("/add")
		public int add () {
			int i=2;
			int j=3;
			return i+j;
		}
		
		@RequestMapping("/mul")
			public int mul ()
	{
			int i=8;
			int j=9;
			return i*j;
		}
		public static void main(String [] args) {
			Democlass c=new Democlass();
			c.add();
		}
		

	}



