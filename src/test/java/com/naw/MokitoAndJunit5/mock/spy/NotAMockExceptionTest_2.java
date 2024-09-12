package com.naw.MokitoAndJunit5.mock.spy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(value = { MockitoExtension.class })
public class NotAMockExceptionTest_2 {

	@Spy
	private List<String> spyList;

	@Test
	void spyTest() {
		// Stubbing a Spy
		Mockito.doReturn(20).when(spyList).size();
		assertEquals(20, spyList.size(), "List Size should be 20.");

	}

}
