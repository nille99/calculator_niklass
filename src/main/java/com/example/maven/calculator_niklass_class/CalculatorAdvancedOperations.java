package com.example.maven.calculator_niklass_class;
import com.example.maven.calculator_niklass_interface.CalculatorAdvancedOperationsInterface;

public class CalculatorAdvancedOperations implements CalculatorAdvancedOperationsInterface {

	public double square(double number) {
		return number * number;
	}
	public double cube(double number){
	    return (number*number*number);
	}
	
	public double percentage(double percentageNumber, double number ){
		double result = number*(percentageNumber/100);
		return result;

	}
	public double pi(double number){
	    return (number*Math.PI);
	}
	public double sqrt(double number){
	    return (Math.sqrt(number));
	}
	
	public double raisedToThePowerOf(double base, double exponent) {
		return Math.pow(base, exponent);
	}

}
