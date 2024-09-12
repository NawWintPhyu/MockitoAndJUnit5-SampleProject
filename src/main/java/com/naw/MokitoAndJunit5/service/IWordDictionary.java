package com.naw.MokitoAndJunit5.service;

public interface IWordDictionary {
	void add(String word, String meaning);

	String getMeaning(String word);

}
