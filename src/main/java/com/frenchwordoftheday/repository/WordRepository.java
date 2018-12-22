package com.frenchwordoftheday.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.frenchwordoftheday.entity.Word;

public interface WordRepository extends CrudRepository<Word, Long> {
	
	List<Word> findByWord(String word);

	List<Word> findByPartOfSpeech(String partOfSpeech);
	
	List<Word> findByGender(String gender);

}
