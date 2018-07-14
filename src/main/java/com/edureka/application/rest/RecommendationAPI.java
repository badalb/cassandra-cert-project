package com.edureka.application.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edureka.application.applservice.RecommendationService;
import com.edureka.application.rest.model.Recommendation;

@RestController
@RequestMapping("/recommendations")
public class RecommendationAPI {

	@Autowired
	private RecommendationService recommendationSerice;

	@GetMapping("/{movieName}")
	public List<Recommendation> getRecommendations(@PathVariable("movieName") String movieName) {
		return recommendationSerice.getAllRecommendations(movieName);
	}

}
