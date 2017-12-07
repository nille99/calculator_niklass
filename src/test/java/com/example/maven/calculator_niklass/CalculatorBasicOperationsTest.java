package com.example.maven.calculator_niklass;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import com.example.maven.calculator_niklass_class.CalculatorBasicOperations;

public class CalculatorBasicOperationsTest {

	CalculatorBasicOperations c = new CalculatorBasicOperations();
	static final Logger LOG = Logger.getLogger(CalculatorBasicOperations.class.getName());
	Random r = new Random();
	
	
	@Test
	public void testAddMethod() {
		for(int i = 0; i <10 ;i++) {
			int firstNumber = r.nextInt(100);
			int secondNumber = r.nextInt(100);
			int result = 0;
			result = firstNumber + secondNumber;
			LOG.info("Testing the method addition with" + firstNumber + " and " + secondNumber);
			assertEquals(c.addition(firstNumber, secondNumber), result);
		}
	}
	@Test
	public void testSubtractMethod() {
		for(int i = 0; i <10 ;i++) {
			int firstNumber = r.nextInt(100);
			int secondNumber = r.nextInt(100);
			int result = 0;
			result = firstNumber - secondNumber;
			LOG.info("Testing the subtraction add with" + firstNumber + " and " + secondNumber);
			assertEquals(c.subtraction(firstNumber, secondNumber), result);
		}
	}
	
	@Test
	public void testMultiplyMethod() {
		for(int i = 0; i <10 ;i++) {
			int firstNumber = r.nextInt(100);
			int secondNumber = r.nextInt(100);
			int result = 0;
			result = firstNumber * secondNumber;
			LOG.info("Testing the multiplication add with" + firstNumber + " and " + secondNumber);
			assertEquals(c.multiplication(firstNumber, secondNumber), result);
		}
	}
	
	@Test
	public void testDivideMethod() {
		
		for(int i = 0;i<100;i++) {
			int firstNumber = r.nextInt(100);
			int secondNumber = r.nextInt(100);
			int result = 0;
			result = firstNumber / secondNumber;
			
			LOG.info("Testing the method divide with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(c.division(firstNumber, secondNumber)), Math.round(result),1);			
		}
	}
	
	

}
