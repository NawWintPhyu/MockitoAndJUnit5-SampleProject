package com.naw.MokitoAndJunit5.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

public class WordDictionaryTest {

	/**
	 * Test for non-void Return Type method with Exception
	 */
	@Test
	public void nonVoidMethodThrowingExceptionMockitoTest() {
		try {
			WordDictionary wordDictionary = mock(WordDictionary.class);
			when(wordDictionary.getMeaning(anyString())).thenThrow(NullPointerException.class);
			wordDictionary.getMeaning("awesome");

		} catch (Exception e) {
			System.out.println("Exception occured!");
			assertTrue(e instanceof NullPointerException);
		}
	}

	/**
	 * Test for void Return Type method with Exception
	 */
	@Test
	public void voidMethodThrowingExceptionMockitoTest() {
		WordDictionary wordDictionary = mock(WordDictionary.class);
		doThrow(new IllegalStateException("Error occurred!")).when(wordDictionary).add(anyString(), anyString());
		assertThrows(IllegalStateException.class, () -> wordDictionary.add("awesome", "Very Good"));

	}

	/**
	 * Test case for Exception as an Object
	 */
	@Test
	public void voidMethodThrowingIllegalStateExceptionMockitoTest() {
		WordDictionary wordDictionary = mock(WordDictionary.class);
		doThrow(new IllegalStateException("Error Occurred!")).when(wordDictionary).add(anyString(), anyString());
		assertThrows(IllegalStateException.class, () -> wordDictionary.add("awesome", "Very Good"));

	}

	/**
	 * Configure Spy to throw an Exception the same way we did with the mock
	 */
	@Test
	public void nonVoidMethodThrowingExceptionWithSpyMockitoTest() {

		String emptyWord = "";
		try {
			WordDictionary wordDictionary = new WordDictionary();
			WordDictionary spyWordDictionary = spy(wordDictionary);

			when(spyWordDictionary.getMeaning(emptyWord))
					.thenThrow(new IllegalArgumentException("Input is not valid!!"));
			spyWordDictionary.getMeaning(emptyWord);

		} catch (Exception e) {

			assertTrue(e instanceof IllegalArgumentException);
			assertEquals("Input is not valid!!", e.getMessage());
		}
	}

	@Test
	public void whenAddCalledWithVerify() {
		WordDictionary wordDictionary = mock(WordDictionary.class);
		doNothing().when(wordDictionary).add(anyString(), anyString());
		wordDictionary.add("awesome", "Very Good");
		verify(wordDictionary, times(1)).add("awesome", "Very Good");
		System.out.println(wordDictionary.getMeaning("awesome"));
	}

	@Test
	public void whenAddCalledRealMethodUsingSpy() {
		WordDictionary wordDictionary = spy(WordDictionary.class);
		doCallRealMethod().when(wordDictionary).add(anyString(), anyString());
		wordDictionary.add("awesome", "Very Good");
		verify(wordDictionary, times(1)).add("awesome", "Very Good");
		assertEquals("Very Good", wordDictionary.getMeaning("awesome"));
		System.out.println(wordDictionary.getMeaning("awesome"));
	}

	@Test
	public void whenAddCalledValueCaptured() {

		WordDictionary wordDictionary = mock(WordDictionary.class);
		ArgumentCaptor<String> valueCaptor = ArgumentCaptor.forClass(String.class);
		doNothing().when(wordDictionary).add(anyString(), valueCaptor.capture());
		// System.out.println("Before adding value:" + valueCaptor.getValue());
		wordDictionary.add("awesome", "Very Good! Do it again!");
		// System.out.println("After adding value:" + valueCaptor.getValue());
		assertEquals("Very Good! Do it again!", valueCaptor.getValue());
	}
}
