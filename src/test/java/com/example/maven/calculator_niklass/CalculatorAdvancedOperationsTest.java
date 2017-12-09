package com.example.maven.calculator_niklass;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import com.example.maven.calculator_niklass_class.CalculatorAdvancedOperations;

public class CalculatorAdvancedOperationsTest {

	CalculatorAdvancedOperations calculator = new CalculatorAdvancedOperations();
	static final Logger LOG = Logger.getLogger(CalculatorAdvancedOperations.class.getName());
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();

	@Test
	public void testSquarePositiveNumbers() {
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			result = firstNumber * firstNumber;

			LOG.info("Testing the method square with: " + firstNumber);
			assertEquals(Math.round(calculator.square(firstNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testSquareZeros() {
		double firstNumber = 0;
		double result = firstNumber * firstNumber;

		LOG.info("Testing the method square with: " + firstNumber);
		assertEquals(Math.round(calculator.square(firstNumber)), Math.round(result), 1);
	}

	@Test
	public void testSquareNegativeNumbers() {
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(-random.nextDouble() * 10));
			result = firstNumber * firstNumber;

			LOG.info("Testing the method square with: " + firstNumber);
			assertEquals(Math.round(calculator.square(firstNumber)), Math.round(result), 1);

		}
	}

	/// ---------------

	@Test
	public void testCubePositiveNumbers() {
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			result = firstNumber * firstNumber * firstNumber;

			LOG.info("Testing the method square with: " + firstNumber);
			assertEquals(Math.round(calculator.cube(firstNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testCubeZeros() {
		double firstNumber = 0;
		double result = firstNumber * firstNumber * firstNumber;

		LOG.info("Testing the method square with: " + firstNumber);
		assertEquals(Math.round(calculator.cube(firstNumber)), Math.round(result), 1);
	}

	@Test
	public void testCubeNegativeNumbers() {
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(-random.nextDouble() * 10));
			result = firstNumber * firstNumber * firstNumber;

			LOG.info("Testing the method square with: " + firstNumber);
			assertEquals(Math.round(calculator.cube(firstNumber)), Math.round(result), 1);
		}
	}
	/// ---------------

	@Test
	public void testPercentagePositiveNumbers() {
		double number = 0;
		double percentageNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			number = Double.valueOf(df.format(random.nextDouble() * 10));
			percentageNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			result = number * (percentageNumber / 100);

			LOG.info("Testing the method percentage with: " + percentageNumber + "% av " + number);
			assertEquals(Math.round(calculator.percentage(percentageNumber, number)), Math.round(result), 1);

		}
	}

	@Test
	public void testPercentageZeros() {
		double number = 0;
		double percentageNumber = 0;
		double result = 0;
		// Testing the case 0 number/ random %
		for (int i = 0; i < 50; i++) {
			percentageNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			result = number * (percentageNumber / 100);

			LOG.info("Testing the method percentage with: " + percentageNumber + "% av " + number);
			assertEquals(Math.round(calculator.percentage(percentageNumber, number)), Math.round(result), 1);

		}
		// Testing the case random number/ 0 %

		for (int i = 0; i < 50; i++) {
			number = Double.valueOf(df.format(random.nextDouble() * 100));
			result = number * (percentageNumber / 100);

			LOG.info("Testing the method percentage with: " + percentageNumber + "% av " + number);
			assertEquals(Math.round(calculator.percentage(percentageNumber, number)), Math.round(result), 1);

		}

		// Testing the case 0 number/ 0 %
		for (int i = 0; i < 50; i++) {
			result = number * (percentageNumber / 100);

			LOG.info("Testing the method percentage with: " + percentageNumber + "% av " + number);
			assertEquals(Math.round(calculator.percentage(percentageNumber, number)), Math.round(result), 1);

		}
	}

	@Test
	public void testPercentageNegativeNumbers() {
		double number = 0;
		double percentageNumber = 0;
		double result = 0;

		// Testing the case negative random number/ random %
		for (int i = 0; i < 50; i++) {
			number = Double.valueOf(df.format(-random.nextDouble() * 10));
			percentageNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			result = number * (percentageNumber / 100);

			LOG.info("Testing the method percentage with: " + percentageNumber + "% av " + number);
			assertEquals(Math.round(calculator.percentage(percentageNumber, number)), Math.round(result), 1);
		}
		// Testing the case negative random number/ negative random %
		for (int i = 0; i < 50; i++) {
			number = Double.valueOf(df.format(-random.nextDouble() * 10));
			percentageNumber = Double.valueOf(df.format(-random.nextDouble() * 100));
			result = number * (percentageNumber / 100);

			LOG.info("Testing the method percentage with: " + percentageNumber + "% av " + number);
			assertEquals(Math.round(calculator.percentage(percentageNumber, number)), Math.round(result), 1);
		}
		// Testing the case random number/ negative random %
		for (int i = 0; i < 50; i++) {
			number = Double.valueOf(df.format(random.nextDouble() * 10));
			percentageNumber = Double.valueOf(df.format(-random.nextDouble() * 100));
			result = number * (percentageNumber / 100);

			LOG.info("Testing the method percentage with: " + percentageNumber + "% av " + number);
			assertEquals(Math.round(calculator.percentage(percentageNumber, number)), Math.round(result), 1);
		}

	}

	//--------------
	@Test
	public void testPiPositiveNumbers() {
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			result = (firstNumber*Math.PI);
		
			LOG.info("Testing the method pi with: " + firstNumber);
			assertEquals(Math.round(calculator.pi(firstNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testPiZeros() {
		double firstNumber = 0;
		double result = (firstNumber*Math.PI);

		LOG.info("Testing the method pi with: " + firstNumber);
		assertEquals(Math.round(calculator.pi(firstNumber)), Math.round(result), 1);
	}

	@Test
	public void testPiNegativeNumbers() {
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(-random.nextDouble() * 10));
			result = (firstNumber*Math.PI);

			LOG.info("Testing the method pi with: " + firstNumber);
			assertEquals(Math.round(calculator.pi(firstNumber)), Math.round(result), 1);
		}
	}	
	//--------------
	@Test
	public void testSqrtPositiveNumbers() {
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			result = (Math.sqrt(firstNumber));
		
			LOG.info("Testing the method sqrt with: " + firstNumber);
			assertEquals(Math.round(calculator.sqrt(firstNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testSqrtZeros() {
		double firstNumber = 0;
		double result = (Math.sqrt(firstNumber));

		LOG.info("Testing the method sqrt with: " + firstNumber);
		assertEquals(Math.round(calculator.sqrt(firstNumber)), Math.round(result), 1);
	}

	@Test
	public void testSqrtNegativeNumbers() {
		double firstNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(-random.nextDouble() * 10));
			result = (Math.sqrt(firstNumber));
			
			LOG.info("Testing the method sqrt with: " + firstNumber);
			assertEquals(Math.round(calculator.sqrt(firstNumber)), Math.round(result), 1);
		}
	}	

	//--------------
		@Test
		public void testRaisedToThePowerOfPositiveNumbers() {
			double base = 0;
			double exponent = 0;
			double result = 0;

			for (int i = 0; i < 50; i++) {
				base = Double.valueOf(df.format(random.nextDouble() * 10));
				exponent = Double.valueOf(df.format(random.nextDouble() * 10));
				result = (Math.pow(base, exponent));
			
				LOG.info("Testing the method raisedToThePowerOf with: " + base + " and " + exponent);
				assertEquals(Math.round(calculator.raisedToThePowerOf(base, exponent)), Math.round(result), 1);

			}
		}

		@Test
		public void testRaisedToThePowerOfZeros() {
			double base = 0;
			double exponent = 0;
			double result = 0;		
			//Testing the case 0 base/ 0 exponent
			
			result = (Math.pow(base, exponent));

			LOG.info("Testing the method raisedToThePowerOf with: " + base + " and " + exponent);
			assertEquals(Math.round(calculator.raisedToThePowerOf(base, exponent)), Math.round(result), 1);

			//Testing the case 0 base/ random exponent
			exponent = Double.valueOf(df.format(random.nextDouble() * 10));
			result = (Math.pow(base, exponent));

			LOG.info("Testing the method raisedToThePowerOf with: " + base + " and " + exponent);
			assertEquals(Math.round(calculator.raisedToThePowerOf(base, exponent)), Math.round(result), 1);
			
			//Testing the case random base/ 0 exponent
			base = Double.valueOf(df.format(random.nextDouble() * 10));
			result = (Math.pow(base, exponent));

			LOG.info("Testing the method raisedToThePowerOf with: " + base + " and " + exponent);
			assertEquals(Math.round(calculator.raisedToThePowerOf(base, exponent)), Math.round(result), 1);
		}

		@Test
		public void testRaisedToThePowerOfNegativeNumbers() {
			double base = 0;
			double exponent = 0;
			double result = 0;

			//Testing the case negative random base/ negative random exponent
			for (int i = 0; i < 50; i++) {
				base = Double.valueOf(df.format(-random.nextDouble() * 10));
				exponent = Double.valueOf(df.format(-random.nextDouble() * 10));
				result = (Math.pow(base, exponent));
				
				LOG.info("Testing the method raisedToThePowerOf with: " + base + " and " + exponent);
				assertEquals(Math.round(calculator.raisedToThePowerOf(base, exponent)), Math.round(result), 1);
			}
			// Testing the case negative random base/ 0 exponent
			for (int i = 0; i < 50; i++) {
				base = Double.valueOf(df.format(-random.nextDouble() * 10));
				result = (Math.pow(base, exponent));
				
				LOG.info("Testing the method raisedToThePowerOf with: " + base + " and " + exponent);
				assertEquals(Math.round(calculator.raisedToThePowerOf(base, exponent)), Math.round(result), 1);
			}
			// Testing the case 0 base/ negative random exponent
			for (int i = 0; i < 50; i++) {
				exponent = Double.valueOf(df.format(-random.nextDouble() * 10));
				result = (Math.pow(base, exponent));
				
				LOG.info("Testing the method raisedToThePowerOf with: " + base + " and " + exponent);
				assertEquals(Math.round(calculator.raisedToThePowerOf(base, exponent)), Math.round(result), 1);
			}
		}	

}		