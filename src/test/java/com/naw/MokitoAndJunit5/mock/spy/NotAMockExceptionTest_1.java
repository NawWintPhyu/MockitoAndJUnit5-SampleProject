package com.naw.MokitoAndJunit5.mock.spy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class NotAMockExceptionTest_1 {
	@Test
	void spyTest() {

		List<String> spyList = Mockito.spy(new ArrayList<String>());
		// Stubbing a Spy
		Mockito.doReturn(20).when(spyList).size();
		assertEquals(20, spyList.size(), "List Size should be 20.");

	}

}
