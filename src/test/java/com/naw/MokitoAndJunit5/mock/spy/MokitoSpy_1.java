package com.naw.MokitoAndJunit5.mock.spy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MokitoSpy_1 {

	@Test
	public void spyWithoutAnnotationTest() {
		ArrayList<String> spyMyList = Mockito.spy(new ArrayList<String>());
		// ArrayList<String> spyMyList = Mockito.mock(ArrayList.class);
		spyMyList.add("KK");
		spyMyList.add("PK");
		assertEquals(2, spyMyList.size());

	}

}
