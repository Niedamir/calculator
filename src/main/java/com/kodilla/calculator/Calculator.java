package com.kodilla.calculator;

public class Calculator {
	 private double a = 0;
	 private double b = 0;

	 public Calculator(double a, double b) {
	 	 this.a = a;
	 	 this.b = b;
	 }

	 public double add() {
	 	 return a + b;
	 }
	 public double subtract() {
	 	 return a - b;
	 }
}
