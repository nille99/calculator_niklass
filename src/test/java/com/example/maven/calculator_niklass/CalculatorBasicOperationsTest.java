package com.example.maven.calculator_niklass;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import com.example.maven.calculator_niklass_class.CalculatorBasicOperations;

public class CalculatorBasicOperationsTest {

	private static final Logger LOG = Logger.getLogger(CalculatorBasicOperations.class.getName());
	CalculatorBasicOperations calculator = new CalculatorBasicOperations();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();

	// -----------------------
	// Test case for addition
	// -----------------------

	@Test
	public void testadditionPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method addition with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.addition(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testadditionZeros() {
		// Testing the case 0 + 0
		double firstNumber = 0;
		double secondNumber = 0;
		double result = firstNumber + secondNumber;

		LOG.info("Testing the method addition with: " + firstNumber + " and " + secondNumber);
		assertEquals(Math.round(calculator.addition(firstNumber, secondNumber)), Math.round(result), 1);

		// Testing the case 0 + random
		for (int i = 0; i < 50; i++) {
			firstNumber = 0;
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method addition with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.addition(firstNumber, secondNumber)), Math.round(result), 1);

			// Testing the case random + 0

			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			secondNumber = 0;
			result = firstNumber + secondNumber;

			LOG.info("Testing the method addition with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.addition(firstNumber, secondNumber)), Math.round(result), 1);
		}
	}

	@Test
	public void testadditionNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(-random.nextDouble() * 1000));
			secondNumber = Double.valueOf(df.format(-random.nextDouble() * 1000));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method addition with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.addition(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	// -----------------------
	// Test case for subtraction
	// -----------------------

	@Test
	public void testsubtractionPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			result = firstNumber - secondNumber;

			LOG.info("Testing the method subtraction with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.subtraction(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testsubtractionZeros() {
		// Testing the case 0 - 0
		double firstNumber = 0;
		double secondNumber = 0;
		double result = firstNumber - secondNumber;

		LOG.info("Testing the method subtraction with: " + firstNumber + " and " + secondNumber);
		assertEquals(Math.round(calculator.subtraction(firstNumber, secondNumber)), Math.round(result), 1);

		// Testing the case 0 - random
		for (int i = 0; i < 50; i++) {
			firstNumber = 0;
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			result = firstNumber - secondNumber;

			LOG.info("Testing the method subtraction with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.subtraction(firstNumber, secondNumber)), Math.round(result), 1);

			// Testing the case random - 0

			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			secondNumber = 0;
			result = firstNumber - secondNumber;

			LOG.info("Testing the method subtraction with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.subtraction(firstNumber, secondNumber)), Math.round(result), 1);
		}
	}

	@Test
	public void testsubtractionNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(-random.nextDouble() * 1000));
			secondNumber = Double.valueOf(df.format(-random.nextDouble() * 1000));
			result = firstNumber - secondNumber;

			LOG.info("Testing the method subtraction with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.subtraction(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	// -----------------------
	// Test case for multiplication
	// -----------------------

	@Test
	public void testmultiplicationPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			result = firstNumber * secondNumber;

			LOG.info("Testing the method multiplication with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.multiplication(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testmultiplicationZeros() {
		// Testing the case 0 * 0
		double firstNumber = 0;
		double secondNumber = 0;
		double result = firstNumber * secondNumber;

		LOG.info("Testing the method multiplication with: " + firstNumber + " and " + secondNumber);
		assertEquals(Math.round(calculator.multiplication(firstNumber, secondNumber)), Math.round(result), 1);

		// Testing the case 0 * random
		for (int i = 0; i < 50; i++) {
			firstNumber = 0;
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			result = firstNumber * secondNumber;

			LOG.info("Testing the method multiplication with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.multiplication(firstNumber, secondNumber)), Math.round(result), 1);

			// Testing the case random * 0

			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			secondNumber = 0;
			result = firstNumber * secondNumber;

			LOG.info("Testing the method multiplication with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.multiplication(firstNumber, secondNumber)), Math.round(result), 1);
		}
	}

	@Test
	public void testmultiplicationNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(-random.nextDouble() * 1000));
			secondNumber = Double.valueOf(df.format(-random.nextDouble() * 1000));
			result = firstNumber * secondNumber;

			LOG.info("Testing the method multiplication with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.multiplication(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	// -----------------------
	// Test case for division
	// -----------------------

	@Test
	public void testdivisionPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			result = firstNumber / secondNumber;

			LOG.info("Testing the method division with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.division(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testdivisionZeros() {
		// Testing the case 0 / 0
		double firstNumber = 0;
		double secondNumber = 0;
		double result = -0.123456789;

		LOG.info("Testing the method division with: " + firstNumber + " and " + secondNumber);
		assertEquals(Math.round(calculator.multiplication(firstNumber, secondNumber)), Math.round(result), 1);

		// Testing the case 0 / 0
		for (int i = 0; i < 50; i++) {
			firstNumber = 0;
			secondNumber = 0;
			result = -0.123456789;

			LOG.info("Testing the method division with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.division(firstNumber, secondNumber)), Math.round(result), 1);

			// Testing the case random / 0
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			secondNumber = 0;
			result = -0.123456789;

			LOG.info("Testing the method division with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.division(firstNumber, secondNumber)), Math.round(result), 1);

			// Testing the case 0 / random

			firstNumber = 0;
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			result = 0;

			LOG.info("Testing the method division with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.division(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testdivisionNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(-random.nextDouble() * 1000));
			secondNumber = Double.valueOf(df.format(-random.nextDouble() * 1000));
			result = firstNumber / secondNumber;

			LOG.info("Testing the method division with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.division(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

}
