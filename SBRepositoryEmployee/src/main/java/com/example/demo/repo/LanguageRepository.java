package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Language;

public interface LanguageRepository extends CrudRepository<Language, Integer> {

	Language findByLanguage(String language);
}
