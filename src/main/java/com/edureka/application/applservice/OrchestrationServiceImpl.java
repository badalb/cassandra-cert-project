package com.edureka.application.applservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edureka.application.repository.MovieRepository;
import com.edureka.application.rest.model.Movie;

@Service
public class OrchestrationServiceImpl implements OrchestrationService {

	@Autowired
	private MovieRepository movieRepository;

	@Override
	public List<Movie> getAllMovies() {

		return movieRepository.getAllMovies();
	}

}
