package com.example.maven.calculator_niklass_interface;

/***
 * Assignment calculator main
 * 
 * @author Niklas
 * @version 1.0
 * 
 *          This is an interface for CalculatorAdvancedOperations
 *
 */

public interface CalculatorAdvancedOperationsInterface {
	public double square(double number);
	public double cube(double number);
	public double percentage(double percentageNumber,double number);
	public double pi(double number);
	public double sqrt(double number);
	public double raisedToThePowerOf(double base, double exponent);
}
