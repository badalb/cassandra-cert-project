package com.edureka.application.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edureka.application.rest.model.Movie;

@RestController
@RequestMapping("/recommendations")
public class RecommendationAPI {

	@GetMapping("/{movieName}")
	public List<Movie> getRecommendations(@PathVariable("movieName") String movieName) {
		return Arrays.asList(new Movie());
	}

}
