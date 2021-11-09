package com.Service;

import java.util.List;
import com.Entity.Review;
import com.Exception.CustomerFeedbackException;

public interface CustomerFeedbackService {
	
	List<Review> getAllReviews() throws CustomerFeedbackException;
	
	int getReviewByreviewRating(int reviewRating) throws CustomerFeedbackException;
	
	Review addReview(Review review) throws CustomerFeedbackException;
	
	Review updateReview(int feedbackId,Review review) throws CustomerFeedbackException;

}
