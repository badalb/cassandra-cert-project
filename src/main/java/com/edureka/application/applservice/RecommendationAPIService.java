package com.edureka.application.applservice;

import java.util.List;

import com.edureka.application.rest.model.Movie;

public interface RecommendationAPIService {

	public List<Movie> getAllRecommendations(String movieName);
}
