package com.edureka.application.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edureka.application.rest.model.Movie;

@RestController
@RequestMapping("/OrchestrationAPI")
public class OrchestrationAPI {
	
	@GetMapping("/movies")
	public List<Movie> getAllMovies(){
		
		return Arrays.asList(new Movie());
	}

}
