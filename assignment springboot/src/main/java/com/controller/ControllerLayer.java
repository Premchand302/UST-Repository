package com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.ServiceLayer;

@RestController
public class ControllerLayer {
	
	@Autowired
	private ServiceLayer service;
	
	@GetMapping("/welcome")
	public String Welcome() {
		return service.welcomeMessage();
	}
	
	@GetMapping("/add")
	public int add(@RequestParam int a, @RequestParam int b) {
		return service.add(a, b);
	}
	
	@GetMapping("/evenodd/{num}")
	public String evenOdd(@PathVariable int num) {
		return service.checkEvenOdd(num);
	}
	
	@GetMapping("/age/{age}")
	public String age(@PathVariable int age) {
		return service.checkAge(age);
	}
	
	@GetMapping("/grade/{marks}")
	public String gradeCheck(@PathVariable int marks) {
		return service.checkGrade(marks);
	}
	
	@GetMapping("/celsius-to-fahrenheit/{celsius}")
	public double convertTemp(@PathVariable double celsius) {
		return service.convertCelsius(celsius);
	}
	
	@GetMapping("/reverse/{text}")
	public String reverseText(@PathVariable String text) {
		return service.reverse(text);
	}
	
	@GetMapping("/palindrome/{word}")
	public String palindrome(@PathVariable String word) {
		return service.palindrome(word);
	}
	
	@GetMapping("/factorial/{num}")
    public long factorial(@PathVariable int num) {
        return service.factorial(num);
    }

    @GetMapping("/prime/{num}")
    public String prime(@PathVariable int num) {
        return service.isPrime(num);
    }
    
    @GetMapping("/discount")
    public double discount(@RequestParam double price, @RequestParam double discount) {
        return service.calculateDiscount(price, discount);
    }
    
    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        return service.validateLogin(username, password);
    }

    @GetMapping("/interest")
    public double interest(@RequestParam double p,@RequestParam double r,@RequestParam double t) {
        return service.calculateInterest(p, r, t);
    }
    
    @PostMapping("/wordcount")
    public int wordCount(@RequestParam String sentence) {
        return service.countWords(sentence);
    }
    
    @GetMapping("/max")
    public int max(@RequestParam int a,@RequestParam int b, @RequestParam int c) {
        return service.findMax(a, b, c);
    }
	
}
