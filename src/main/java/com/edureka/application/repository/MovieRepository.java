package com.edureka.application.repository;

import java.util.List;

import com.edureka.application.rest.model.Movie;
import com.edureka.application.rest.model.Recommendation;

public interface MovieRepository {

	public void createMovie(Movie movie);

	public List<Movie> getAllMovies();

	public List<Recommendation> findRecommendedMovies(String movieName);

}
