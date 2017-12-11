package com.example.maven.calculator_niklass_class;

import javax.swing.JOptionPane;

/***
 * Assignment calculator main
 * 
 * @author Niklas
 * @version 1.0
 * 
 * <h1>The calculator_ system</h1>
 * This is a class for CalculatorBasicOperations.
 *
 */

import com.example.maven.calculator_niklass_interface.CalculatorBasicOperationsInterface;

public class CalculatorBasicOperations implements CalculatorBasicOperationsInterface {
	
	/**
	 * This is the method for addition. addition(double firstNumber, double secondNumber)
	 */
	public double addition(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}
	/**
	 * This is the subtraction for addition. subtraction(double firstNumber, double secondNumber)
	 */
	public double subtraction(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}
	/**
	 * This is the multiplication for addition.  multiplication(double firstNumber, double secondNumber) 
	 */
	public double multiplication(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}

	/**
	 * This is the division for addition. division(double firstNumber, double secondNumber)
	 */
	public double division(double firstNumber, double secondNumber) {
		double result = firstNumber / secondNumber;
		if (Double.isInfinite(result)) {
			System.out.println("Division by zero?");
			JOptionPane.showMessageDialog(null, "You can not divide by zero!");
			return -0.123456789;
		} else {
			return result;
		}

	}




}
