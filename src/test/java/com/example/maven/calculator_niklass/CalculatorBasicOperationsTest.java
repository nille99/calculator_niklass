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

	@Test
	public void testadditionSmallSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method addition with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.addition(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testadditionMediumSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method addition with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.addition(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testadditionLargeSizedPositiveNumbers() {
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
	public void testadditionSmallSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(-random.nextDouble() * 10));
			secondNumber = Double.valueOf(df.format(-random.nextDouble() * 10));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method addition with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.addition(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testadditionMediumSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(-random.nextDouble() * 100));
			secondNumber = Double.valueOf(df.format(-random.nextDouble() * 100));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method addition with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.addition(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testadditionLargeSizedNegativeNumbers() {
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
	@Test
	public void testsubtractionSmallSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			result = firstNumber - secondNumber;

			LOG.info("Testing the method subtraction with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.subtraction(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testsubtractionMediumSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			result = firstNumber - secondNumber;

			LOG.info("Testing the method subtraction with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.subtraction(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testsubtractionLargeSizedPositiveNumbers() {
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
	public void testsubtractionSmallSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(-random.nextDouble() * 10));
			secondNumber = Double.valueOf(df.format(-random.nextDouble() * 10));
			result = firstNumber - secondNumber;

			LOG.info("Testing the method subtraction with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.subtraction(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testsubtractionMediumSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(-random.nextDouble() * 100));
			secondNumber = Double.valueOf(df.format(-random.nextDouble() * 100));
			result = firstNumber - secondNumber;

			LOG.info("Testing the method subtraction with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.subtraction(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testsubtractionLargeSizedNegativeNumbers() {
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
	@Test
	public void testmultiplicationSmallSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			result = firstNumber * secondNumber;

			LOG.info("Testing the method multiplication with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.multiplication(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testmultiplicationMediumSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			result = firstNumber * secondNumber;

			LOG.info("Testing the method multiplication with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.multiplication(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testmultiplicationLargeSizedPositiveNumbers() {
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
	public void testmultiplicationSmallSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(-random.nextDouble() * 10));
			secondNumber = Double.valueOf(df.format(-random.nextDouble() * 10));
			result = firstNumber * secondNumber;

			LOG.info("Testing the method multiplication with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.multiplication(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testmultiplicationMediumSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(-random.nextDouble() * 100));
			secondNumber = Double.valueOf(df.format(-random.nextDouble() * 100));
			result = firstNumber * secondNumber;

			LOG.info("Testing the method multiplication with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.multiplication(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testmultiplicationLargeSizedNegativeNumbers() {
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
	@Test
	public void testdivisionSmallSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			result = firstNumber / secondNumber;

			LOG.info("Testing the method division with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.division(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testdivisionMediumSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			result = firstNumber / secondNumber;

			LOG.info("Testing the method division with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.division(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testdivisionLargeSizedPositiveNumbers() {
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

		// Testing the case random / 0
		for (int i = 0; i < 50; i++) {
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
	public void testdivisionSmallSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(-random.nextDouble() * 10));
			secondNumber = Double.valueOf(df.format(-random.nextDouble() * 10));
			result = firstNumber / secondNumber;

			LOG.info("Testing the method division with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.division(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testdivisionMediumSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(-random.nextDouble() * 100));
			secondNumber = Double.valueOf(df.format(-random.nextDouble() * 100));
			result = firstNumber / secondNumber;

			LOG.info("Testing the method division with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.division(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testdivisionLargeSizedNegativeNumbers() {
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
