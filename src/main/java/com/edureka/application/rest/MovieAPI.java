package com.edureka.application.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edureka.application.applservice.MovieService;
import com.edureka.application.rest.model.Movie;

@RestController
@RequestMapping("/movie")
public class MovieAPI {

	@Autowired
	private MovieService movieService;

	@PostMapping
	public boolean createMovie(@RequestBody Movie movie) {
		movieService.createMovie(movie);
		return true;
	}

}
