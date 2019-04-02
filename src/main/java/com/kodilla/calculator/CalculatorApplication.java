package com.kodilla.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);

		Calculator processor = new Calculator(9,7);
		System.out.println("Add a to b result: " + processor.add());
		System.out.println("Subtract b from a result: " + processor.subtract());
	}

}
