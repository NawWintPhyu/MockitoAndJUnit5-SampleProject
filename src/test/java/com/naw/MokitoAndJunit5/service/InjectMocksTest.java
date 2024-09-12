package com.naw.MokitoAndJunit5.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(value = { MockitoExtension.class })
public class InjectMocksTest {
	@Mock
	private Map<String, String> wordMap;

	@InjectMocks
	private IWordDictionary wordDictionary = new WordDictionary();

	@Test
	public void injectMocksTest() {

		when(wordMap.get("awesome")).thenReturn("Very Good");
		assertEquals("Very Good", wordDictionary.getMeaning("awesome"));

	}

}
