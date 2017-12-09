package com.example.maven.calculator_niklass_class;
import javax.swing.JOptionPane;

import com.example.maven.calculator_niklass_interface.CalculatorBasicOperationsInterface;

public class CalculatorBasicOperations implements CalculatorBasicOperationsInterface {
	public double addition(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}
	
	public double subtraction(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}

	public double multiplication(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}


	public double division(double firstNumber, double secondNumber) {
		double result = firstNumber / secondNumber;
		if (Double.isInfinite(result)) {
			System.out.println("Division by zero?");
			//JOptionPane.showMessageDialog(null, "You can not divide by zero!");
			return -0.123456789;
		} else {
			return result;
		}

	}




}
