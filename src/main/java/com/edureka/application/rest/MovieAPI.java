package com.edureka.application.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edureka.application.rest.model.Movie;

@RestController
@RequestMapping("/movie")
public class MovieAPI {

	@PostMapping
	public boolean createMovie(@RequestBody Movie movie) {

		return true;
	}

}
