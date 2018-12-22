package com.frenchwordoftheday.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.frenchwordoftheday.entity.Word;
import com.frenchwordoftheday.service.IWordService;

@Controller
@RequestMapping("word")
public class WordController {

	@Autowired
	private IWordService wordService;

	@GetMapping("")
	public ResponseEntity<List<Word>> getAllWords() {
		List<Word> list = wordService.getAllWords();
		return new ResponseEntity<List<Word>>(list, HttpStatus.OK);
	}

	@GetMapping("random")
	public ResponseEntity<Word> getRandomWord() {
		List<Word> list = wordService.getAllWords();
		Random rand = new Random();
		Word randomWord = list.get(rand.nextInt(list.size()));
		return new ResponseEntity<Word>(randomWord, HttpStatus.OK);
	}

	@GetMapping("{id}")
	public ResponseEntity<Word> getWordById(@PathVariable("id") Integer id) {
		Word word = wordService.getWordById(id);
		return new ResponseEntity<Word>(word, HttpStatus.OK);
	}

}