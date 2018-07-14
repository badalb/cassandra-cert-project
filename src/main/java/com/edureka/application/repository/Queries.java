package com.edureka.application.repository;

public interface Queries {

	public static final String FIND_ALL = "select * from movies";
	public static final String FIND_RECOMMENDATION = "select also_viewed_title from movies where title = 'Titanic' order by count desc";

}
