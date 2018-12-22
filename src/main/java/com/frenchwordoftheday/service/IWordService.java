package com.frenchwordoftheday.service;

import java.util.List;

import com.frenchwordoftheday.entity.Word;

public interface IWordService {
	
	List<Word> getAllWords();

	Word getWordById(long wordId);

	boolean addWord(Word word);

	void updateWord(Word word);

	void deleteWord(int wordId);
}
