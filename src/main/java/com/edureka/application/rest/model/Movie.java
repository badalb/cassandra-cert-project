package com.edureka.application.rest.model;

import java.io.Serializable;

public class Movie implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2731430661826302300L;
	
	private String title;
	
	private String alsoViewed;
	
	private Long count;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAlsoViewed() {
		return alsoViewed;
	}

	public void setAlsoViewed(String alsoViewed) {
		this.alsoViewed = alsoViewed;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}
	
}
