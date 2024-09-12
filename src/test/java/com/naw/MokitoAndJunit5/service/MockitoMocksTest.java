package com.naw.MokitoAndJunit5.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.withSettings;

import org.junit.jupiter.api.Test;
import org.mockito.MockSettings;
import org.mockito.Mockito;

public class MockitoMocksTest {

	@Test
	void simpleMockTest() {
		MyList mockMyList = Mockito.mock(MyList.class);

		when(mockMyList.add("KK")).thenReturn(true);
		boolean added = mockMyList.add("KK");
		verify(mockMyList).add("KK");

		// System.out.println("added:" + added);
		// assertEquals(true, mockMyList.add(anyString()));
		assertEquals(true, added);

	}

	@Test
	void mockingWithNameTest() {
		MyList mockMyList = Mockito.mock(MyList.class, "Mocking MyList");

		when(mockMyList.add(anyString())).thenReturn(false);
		boolean added = mockMyList.add("KK");
		verify(mockMyList).add(anyString());
		assertEquals(false, added);

	}

	@Test
	void mockingWithAnswerTest() {
		MyList mockMyList = Mockito.mock(MyList.class, new MyCustomAnswer());

		when(mockMyList.add(anyString())).thenReturn(false);
		boolean added = mockMyList.add("KK");
		verify(mockMyList).add("KK");
		assertEquals(false, added);

	}

	@Test
	void mockingWithMockSettingsTest() {
		MockSettings mockSettings = withSettings().defaultAnswer(new MyCustomAnswer());
		MyList mockMyList = Mockito.mock(MyList.class, mockSettings);
		boolean added = mockMyList.add("MM");// It is supposed to return true
		System.out.println("Before Added:" + added);
		when(mockMyList.add(anyString())).thenReturn(false);
		added = mockMyList.add("KK");// It is supposed to return false
		System.out.println("After added:" + added);

		verify(mockMyList).add("KK");
		assertEquals(false, added);

	}
}
