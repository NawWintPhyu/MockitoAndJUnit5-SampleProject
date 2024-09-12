package com.naw.MokitoAndJunit5.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

public class MyUtilsTest {

	@Test
	void verify1Test() {

		MyUtils mock = mock(MyUtils.class);
		mock.add(10, 30);
		verify(mock).add(10, 30);
		verify(mock, times(1)).add(10, 30);
	}

	@Test
	void verify2Test() {

		MyUtils mock = mock(MyUtils.class);
		mock.add(10, 30);
		mock.add(10, 30);
		mock.add(10, 30);
		mock.add(10, 30);
		mock.add(10, 30);

		verify(mock, times(5)).add(10, 30);
		verify(mock, atLeast(2)).add(10, 30);
		verify(mock, atLeastOnce()).add(10, 30);
		verify(mock, atMost(5)).add(10, 30);
	}

	@Test
	void verify3Test() {

		MyUtils mock1 = mock(MyUtils.class);
		MyUtils mock2 = mock(MyUtils.class);
		// mock1.add(10, 30);
		verifyNoInteractions(mock1, mock2);
	}

	@Test
	void verify4Test() {
		List mock = mock(List.class);
		mock.add("KK");
		ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);
		verify(mock).add(argumentCaptor.capture());
		// verify(mock).add("KK");
		assertEquals("KK", argumentCaptor.getValue());

	}

	@Test
	void addMockitoSimpleBehaviorTest1() {
		MyUtils mock = mock(MyUtils.class);
		when(mock.add(20, 40)).thenReturn(60);
		doReturn(50).when(mock).add(40, 10);
		assertEquals(60, mock.add(20, 40));
		assertEquals(50, mock.add(40, 10));

	}

	@Test
	void addMockitoSimpleBehaviorTest2() {
		MyUtils mock = mock(MyUtils.class);
		when(mock.multiply(20, 20)).thenReturn(400);
		assertEquals(400, mock.multiply(20, 20));

	}

	@Test
	void addMockitoconsecutiveMethodCallsTest() {

		MyUtils mock = mock(MyUtils.class);
		when(mock.add(anyInt(), anyInt())).thenReturn(60, 70, 90);
		assertEquals(60, mock.add(40, 20));
		assertEquals(70, mock.add(40, 30));
		assertEquals(90, mock.add(40, 50));
	}

	@Test
	void addMockitoSpyBehaviorTest() {

		List spy = spy(List.class);
		doReturn(20).when(spy).size();
		assertEquals(20, spy.size());
	}

	@Test
	void addMockitoBehaviorWithCustomAnswerTest() {

		List mock = mock(List.class);
		doAnswer(answer -> "My Answer").when(mock).get(anyInt());
		// doReturn("My Answer").when(mock).get(anyInt());
		assertEquals("My Answer", mock.get(2));
	}

}
