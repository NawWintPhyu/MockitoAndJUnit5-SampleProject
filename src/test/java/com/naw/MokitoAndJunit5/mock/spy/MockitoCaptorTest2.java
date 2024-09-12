package com.naw.MokitoAndJunit5.mock.spy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(value = { MockitoExtension.class })
public class MockitoCaptorTest2 {

	@Captor
	private ArgumentCaptor<String> argumentCaptor;

	@Test
	void capterTest() {
		List<String> mockList = mock(List.class);
		mockList.add("KK");
		// mockList.add("MM");
		verify(mockList).add(argumentCaptor.capture());
		assertEquals("KK", argumentCaptor.getValue());
	}

}
