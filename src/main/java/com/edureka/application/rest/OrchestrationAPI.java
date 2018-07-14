package com.edureka.application.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edureka.application.applservice.OrchestrationService;
import com.edureka.application.rest.model.Movie;

@RestController
@RequestMapping("/OrchestrationAPI")
public class OrchestrationAPI {

	@Autowired
	private OrchestrationService orchestrationService;

	@GetMapping("/movies")
	public List<Movie> getAllMovies() {
		return orchestrationService.getAllMovies();
	}

}
