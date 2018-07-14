package com.edureka.application.applservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edureka.application.repository.MovieRepository;
import com.edureka.application.rest.model.Recommendation;

@Service
public class RecommendationServiceImpl implements RecommendationService {

	@Autowired
	private MovieRepository movieRepository;

	@Override
	public List<Recommendation> getAllRecommendations(String movieName) {
		return movieRepository.findRecommendedMovies(movieName);
	}

}
