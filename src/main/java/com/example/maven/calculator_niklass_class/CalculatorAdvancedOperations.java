package com.example.maven.calculator_niklass_class;

import com.example.maven.calculator_niklass_interface.CalculatorAdvancedOperationsInterface;

/***
 * Assignment calculator main
 * 
 * @author Niklas
 * @version 1.0
 * 
 *          <h1>The calculator_ system</h1> This is a class for
 *          CalculatorAdvancedOperations.
 *
 */

public class CalculatorAdvancedOperations implements CalculatorAdvancedOperationsInterface {

	/**
	 * This is the method for square. square(double number)
	 */
	public double square(double number) {
		return number * number;
	}

	/**
	 * This is the method for cube. cube(double number)
	 */

	public double cube(double number) {
		return (number * number * number);
	}

	/**
	 * This is the method for percentage.percentage(double percentageNumber, double
	 * number )
	 */

	public double percentage(double percentageNumber, double number) {
		double result = number * (percentageNumber / 100);
		return result;

	}

	/**
	 * This is the method for pi. pi(double number
	 */

	public double pi(double number) {
		return (number * Math.PI);
	}

	/**
	 * This is the method for sqrt. sqrt(double number)
	 */

	public double sqrt(double number) {
		return (Math.sqrt(number));
	}

	/**
	 * This is the method for raisedToThePowerOf. raisedToThePowerOf(double base,
	 * double exponent)
	 */

	public double raisedToThePowerOf(double base, double exponent) {
		return Math.pow(base, exponent);
	}

}
