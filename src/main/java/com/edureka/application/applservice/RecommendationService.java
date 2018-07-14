package com.edureka.application.applservice;

import java.util.List;

import com.edureka.application.rest.model.Recommendation;

public interface RecommendationService {

	public List<Recommendation> getAllRecommendations(String movieName);
}
