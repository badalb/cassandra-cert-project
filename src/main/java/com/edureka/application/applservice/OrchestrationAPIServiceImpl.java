package com.edureka.application.applservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import com.edureka.application.rest.model.Movie;

@Service
public class OrchestrationAPIServiceImpl implements OrchestrationAPIService {

	@Autowired
	private Cluster cluster;

	@Override
	public List<Movie> getAllMovies() {
		
		Session session = cluster.connect();

		//

		session.close();
		return null;
	}

}
