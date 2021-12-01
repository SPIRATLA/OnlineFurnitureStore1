package com.entity;

import javax.persistence.CascadeType; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Review")
public class Review {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int feedBackId;
	
	private int reviewRating;
	
	private String comments;
	
	@ManyToOne(targetEntity = Furniture.class, cascade = CascadeType.ALL)
	private Furniture furniture;

	public int getFeedBackId() {
		return feedBackId;
	}

	public void setFeedBackId(int feedBackId) {
		this.feedBackId = feedBackId;
	}

	public int getReviewRating() {
		return reviewRating;
	}

	public void setReviewRating(int reviewRating) {
		this.reviewRating = reviewRating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Furniture getFurniture() {
		return furniture;
	}

	public void setFurniture(Furniture furniture) {
		this.furniture = furniture;
	}

	@Override
	public String toString() {
		return "Review [feedBackId=" + feedBackId + ", reviewRating=" + reviewRating + ", comments=" + comments
				+ ", furniture=" + furniture + "]";
	}

	public Review(int feedBackId, int reviewRating, String comments, Furniture furniture) {
		super();
		this.feedBackId = feedBackId;
		this.reviewRating = reviewRating;
		this.comments = comments;

		this.furniture = furniture;
	}

	public Review() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + feedBackId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Review other = (Review) obj;
		if (feedBackId != other.feedBackId)
			return false;
		return true;
	}
}
