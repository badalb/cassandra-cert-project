package com.edureka.application.applservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edureka.application.repository.MovieRepository;
import com.edureka.application.rest.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;

	@Override
	public void createMovie(Movie movie) {
		movieRepository.createMovie(movie);
	}

}
