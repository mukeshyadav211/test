package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Language;
import com.example.demo.service.LanguageService;

@RestController
public class LanguageController {

	@Autowired
	LanguageService languageService;

	/* GET method */
	@RequestMapping("/languages")
	public List<Language> getAllLanguages() {

		return languageService.getAllLanguage();
	}

	/* POST method */
	@RequestMapping(method = RequestMethod.POST, value = "/language/add")
	public Language addLanguage(@RequestBody Language language) {
		System.out.println("add lang");
		return languageService.addLanguage(language);

	}

	/* PUT METHOD */
	@RequestMapping(method = RequestMethod.POST, value = "/language/{id}")
	public void updateLanguage(@RequestBody Language language, @PathVariable String name) {
		languageService.updateLanguage(name,language);
	}

	/* DELETE METHOD */
	@RequestMapping(method = RequestMethod.POST, value = "/language/delete/{id}")
	public void deleteLanguage(@PathVariable int Id) {
		languageService.deleteLanguage(Id);
	}

}
