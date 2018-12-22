package com.frenchwordoftheday.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "WORDS")
public class Word implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TRANSLATION_ID")
	private long translationId;
	
	@Column(name = "WORD")
	private String word;
	
	@Column(name = "PRONUNCIATION")
	private String pronunciation;

	@Column(name = "TRANSLATION")
	private String translation;
	
	@Column(name = "GENDER")
	private String gender;
	
	@Column(name = "PART_OF_SPEECH")
	private String partOfSpeech;
	
	public long getTranslationId() {
		return translationId;
	}

	public void setTranslationId(long translationId) {
		this.translationId = translationId;
	}

	public String getTranslation() {
		return translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}

	public String getPartOfSpeech() {
		return partOfSpeech;
	}

	public void setPartOfSpeech(String partOfSpeech) {
		this.partOfSpeech = partOfSpeech;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getPronunciation() {
		return pronunciation;
	}

	public void setPronunciation(String pronunciation) {
		this.pronunciation = pronunciation;
	}

}