package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Language;
import com.example.demo.repo.LanguageRepository;

@Service
public class LanguageService {

	@Autowired
	private LanguageRepository languageRepository;

	public List<Language> getAllLanguage() {

		List<Language> languageList = new ArrayList<>();
		languageRepository.findAll().forEach(languageList::add);
		return languageList;

	}

	public Language getLanguage(String language) {
		return languageRepository.findByLanguage(language);

	}

	public Language addLanguage(Language language) {
		return languageRepository.save(language);

	}

	public void updateLanguage(String name, Language language) {
		languageRepository.save(language);

	}

	public void deleteLanguage(int id) {
		languageRepository.deleteById(id);

	}
}
