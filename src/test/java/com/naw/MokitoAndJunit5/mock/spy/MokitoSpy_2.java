package com.naw.MokitoAndJunit5.mock.spy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

//@TestInstance(value = Lifecycle.PER_CLASS)
@ExtendWith(value = { MockitoExtension.class })
public class MokitoSpy_2 {

//	@BeforeAll
//	public void setUp() {
//		MockitoAnnotations.openMocks(this);
//	}

	@Spy
	private ArrayList<String> spyMyList;

	@Test
	public void spyWithoutAnnotationTest() {

		spyMyList.add("KK");
		spyMyList.add("PK");
		// Stubbing a SPY
		doReturn(40).when(spyMyList).size();
		assertEquals(40, spyMyList.size());
		// System.out.println("spyMyList:" + spyMyList);

	}
}
