package com.naw.MokitoAndJunit5.mock.spy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.junit.jupiter.MockitoExtension;

import com.naw.MokitoAndJunit5.service.model.Person;

@ExtendWith(value = { MockitoExtension.class })
public class MockitoCaptorTest3 {

	@Captor
	private ArgumentCaptor<Person> argumentCaptor;

	@Test
	void capterTest() {
		List<Person> mockList = mock(List.class);
		mockList.add(new Person(10, "KK"));
		mockList.add(new Person(20, "PK"));
		mockList.add(new Person(30, "SK"));
		// mockList.add("MM");
		// verify(mockList).add(argumentCaptor.capture());
		verify(mockList, times(3)).add(argumentCaptor.capture());
		List<Person> personList = argumentCaptor.getAllValues();
		assertEquals(10, personList.get(0).getId());
		assertEquals("KK", personList.get(0).getName());

		assertEquals(20, personList.get(1).getId());
		assertEquals("PK", personList.get(1).getName());

		assertEquals(30, personList.get(2).getId());
		assertEquals("SK", personList.get(2).getName());
	}

}
