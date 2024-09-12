package com.naw.MokitoAndJunit5.service;

import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class MyCustomAnswer implements Answer<Boolean> {

	@Override
	public Boolean answer(InvocationOnMock invocation) throws Throwable {
		// TODO Auto-generated method stub
		return true;
	}

}
