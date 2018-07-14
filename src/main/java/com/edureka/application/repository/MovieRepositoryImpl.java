package com.edureka.application.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.querybuilder.Insert;
import com.datastax.driver.core.querybuilder.QueryBuilder;
import com.edureka.application.rest.model.Movie;
import com.edureka.application.rest.model.Recommendation;

@Repository
public class MovieRepositoryImpl implements MovieRepository {

	@Value("${edureca.cassandra.keyspace}")
	private String keyspace;

	@Autowired
	private Cluster cluster;

	@Override
	public void createMovie(Movie movie) {
		Session session = cluster.connect(keyspace);
		Insert insert = QueryBuilder.insertInto(keyspace, "movies").value("title", movie.getTitle())
				.value("also_viewed_title", movie.getAlsoViewed()).value("count", movie.getCount());
		System.out.println(insert.toString());
		ResultSet result = session.execute(insert.toString());
		System.out.println(result);

		session.close();
	}

	@Override
	public List<Movie> getAllMovies() {
		Session session = cluster.connect(keyspace);
		ResultSet resultSet = session.execute(Queries.FIND_ALL);
		List<Movie> movies = iterateResult(resultSet);
		resultSet = null;
		session.close();
		return movies;
	}

	private List<Movie> iterateResult(ResultSet resultSet) {
		List<Movie> movies = new ArrayList<>();
		for (Row row : resultSet) {
			Movie movie = new Movie();
			movie.setTitle(row.getString("title"));
			movie.setAlsoViewed(row.getString("also_viewed_title"));
			movie.setCount(row.getInt("count"));
			movies.add(movie);
		}
		return movies;
	}

	@Override
	public List<Recommendation> findRecommendedMovies(String movieName) {
		Session session = cluster.connect(keyspace);
		ResultSet resultSet = session.execute(Queries.FIND_RECOMMENDATION);
		List<Recommendation> movies = new ArrayList<>();
		for (Row row : resultSet) {
			Recommendation movie = new Recommendation();
			movie.setRecommendedTitle(row.getString("also_viewed_title"));
			movies.add(movie);
		}
		resultSet = null;
		session.close();
		return movies;
	}

}
