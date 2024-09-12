package com.naw.MokitoAndJunit5.mock.spy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

public class MockitoCaptorTest {

	@Test
	void capterTest() {
		List<String> mockList = mock(List.class);
		mockList.add("KK");
		// mockList.add("MM");
		ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);
		verify(mockList).add(argumentCaptor.capture());
		assertEquals("KK", argumentCaptor.getValue());
	}

}
