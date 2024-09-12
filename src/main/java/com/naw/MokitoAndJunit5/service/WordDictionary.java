package com.naw.MokitoAndJunit5.service;

import java.util.HashMap;
import java.util.Map;

public class WordDictionary implements IWordDictionary {
	private Map<String, String> wordsMap;

	public WordDictionary() {
		wordsMap = new HashMap<String, String>();
	}

	@Override
	public void add(String word, String meaning) {
		wordsMap.put(word, meaning);

	}

	@Override
	public String getMeaning(String word) {
		return wordsMap.get(word);
	}

}
