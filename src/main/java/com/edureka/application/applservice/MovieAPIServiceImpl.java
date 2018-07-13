package com.edureka.application.applservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import com.edureka.application.rest.model.Movie;

@Service
public class MovieAPIServiceImpl implements MovieAPIService{
	
	@Autowired
	private Cluster cluster;

	@Override
	public void createMovie(Movie movie) {
		
		Session session = cluster.connect();
		
		//
		
		
		session.close();
	}
	
	

}
