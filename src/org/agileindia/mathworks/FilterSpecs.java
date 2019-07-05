package org.agileindia.mathworks;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FilterSpecs {
	@Test
	public void selectsPrimeNumbers() {
		// Given
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

		// When
		List<Integer> primeNumbers = Filter.select(numbers, Filter.PRIME);

		// Then
		assertEquals(2, primeNumbers.size());
		assertTrue(primeNumbers.contains(2));
		assertTrue(primeNumbers.contains(3));
		assertFalse(primeNumbers.contains(1));
		assertFalse(primeNumbers.contains(4));
	}

	@Test
	public void doesNotSelectNegativePrimeNumbers() {
		// Given
		List<Integer> numbers = Arrays.asList(-1, 2, -3, 4);

		// When
		List<Integer> primeNumbers = Filter.select(numbers, Filter.PRIME);

		// Then
		assertEquals(1, primeNumbers.size());
		assertTrue(primeNumbers.contains(2));
		assertFalse(primeNumbers.contains(-1));
		assertFalse(primeNumbers.contains(-3));
		assertFalse(primeNumbers.contains(4));
	}

	@Test
	public void selectsOddNumbers() {
		// Given
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

		// When
		List<Integer> oddNumbers = Filter.select(numbers, Filter.ODD);

		// Then
		assertEquals(2, oddNumbers.size());
		assertTrue(oddNumbers.contains(1));
		assertTrue(oddNumbers.contains(3));
		assertFalse(oddNumbers.contains(2));
		assertFalse(oddNumbers.contains(4));
	}

	@Test
	public void doesNotSelectOddNumbers() {
		// Given
		List<Integer> numbers = Arrays.asList(-1, 2, -3, 4);

		// When
		List<Integer> oddNumbers = Filter.select(numbers, Filter.ODD);

		// Then
		assertEquals(2, oddNumbers.size());
		assertTrue(oddNumbers.contains(-1));
		assertFalse(oddNumbers.contains(2));
		assertTrue(oddNumbers.contains(-3));
		assertFalse(oddNumbers.contains(4));
	}
	@Test
	public void selectsOddPrimeNumbers() {
		// Given
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		// When
		List<Integer> oddPrimeNumbers = Filter.select(numbers, Filter.ODD, Filter.PRIME);

		// Then
		assertEquals(2, oddPrimeNumbers.size());
		assertTrue(oddPrimeNumbers.contains(3));
		assertTrue(oddPrimeNumbers.contains(5));
		assertFalse(oddPrimeNumbers.contains(2));
		assertFalse(oddPrimeNumbers.contains(4));
		assertFalse(oddPrimeNumbers.contains(1));
	}
}