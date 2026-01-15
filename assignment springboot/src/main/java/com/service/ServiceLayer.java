package com.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceLayer {
	public String welcomeMessage() {
		return "Welcome to Spring Boot REST API";
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public String checkEvenOdd(int num) {
		if (num % 2 == 0) {
			return "Even";
		}
		else {
			return "Odd";
		}
	}
	
	public String checkAge(int age) {
		if(age < 18) {
			return "Child";
		}
		else if(age < 59) {
			return "Adult";
		}
		else {
			return "Senior";
		}
	}
	
	public String checkGrade(int marks) {
		if(marks >= 90) {
			return "A";
		}
		else if(marks >= 75) {
			return "B";
		}
		else if(marks >= 60) {
			return "C";
		}
		else {
			return "Fail";
		}
	}
	
	public double convertCelsius(double celsius) {
		return (celsius * 9.0/5.0) + 32;
	}
	
	public String reverse(String text) {
		return new StringBuilder(text).reverse().toString();
	}
	
	public String palindrome(String word) {
		String result = new StringBuilder(word).reverse().toString();
		return result.equals(word) ? "Palindrome":"Not Palindrome";
	}
	
	public long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public String isPrime(int num) {
        if (num <= 1) return "Not Prime";
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return "Not Prime";
            }
        }
        return "Prime";
    }
    
    public double calculateDiscount(double price, double discount) {
        return price - (price * discount / 100);
    }
    
    public String validateLogin(String username, String password) {
        if ("admin".equals(username) && "admin123".equals(password)) {
            return "Login Successful";
        } else {
            return "Login Failed";
        }
    }
    
    public double calculateInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }
    
    public int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        return sentence.trim().split("\\s+").length;
    }
    
    public int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}
