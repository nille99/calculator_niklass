package com.example.maven.calculator_niklass;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import com.example.maven.calculator_niklass_class.CalculatorAdvancedOperations;

public class CalculatorAdvancedOperationsTest {
	
	CalculatorAdvancedOperations c = new CalculatorAdvancedOperations();
	static final Logger LOG = Logger.getLogger(CalculatorAdvancedOperations.class.getName());
	Random r = new Random();

	@Test
	public void testSquareMethod() {
		for(int i = 0; i <10 ;i++) {
			int firstNumber = r.nextInt(100);
			int result = 0;
			result = firstNumber * firstNumber;
			LOG.info("Testing the square add with" + firstNumber + " and " + firstNumber);
			assertEquals(c.square(firstNumber), result);
		}
	}
	
	@Test
	public void testCubeMethod() {
		for(int i = 0; i <10 ;i++) {
			int firstNumber = r.nextInt(100);
			int result = 0;
			result = firstNumber * firstNumber * firstNumber;
			LOG.info("Testing the cube add with" + firstNumber);
			assertEquals(c.cube(firstNumber), result);
		}
	}
	

}
