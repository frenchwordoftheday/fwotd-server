package com.frenchwordoftheday.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frenchwordoftheday.entity.Word;
import com.frenchwordoftheday.repository.WordRepository;

@Service
public class WordService implements IWordService {
	
	@Autowired
	private WordRepository wordRepository;

	@Override
	public Word getWordById(long wordId) {
		Word obj = wordRepository.findById(wordId).get();
		return obj;
	}

	@Override
	public List<Word> getAllWords() {
		List<Word> list = new ArrayList<>();
		wordRepository.findAll().forEach(e -> list.add(e));
		return list;
	}

	@Override
	public synchronized boolean addWord(Word word) {
		List<Word> list = wordRepository.findByWord(word.getWord());
		if (list.size() > 0) {
			return false;
		} else {
			wordRepository.save(word);
			return true;
		}
	}

	@Override
	public void updateWord(Word word) {
		wordRepository.save(word);
	}

	@Override
	public void deleteWord(int wordId) {
		wordRepository.delete(getWordById(wordId));
	}
}
