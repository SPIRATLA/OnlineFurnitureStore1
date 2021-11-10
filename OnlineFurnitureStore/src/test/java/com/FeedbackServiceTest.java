package com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Entity.Furniture;
import com.Entity.Review;
import com.Exception.CustomerFeedbackException;
import com.Service.FeedbackServices;

@SpringBootTest
public class FeedbackServiceTest 
{
	@Autowired
	FeedbackServices feedbackService;

	@Test
	void addReviewTest() throws CustomerFeedbackException{
		Review review=new Review();
		review.setFeedBackId(1);
		review.setComments("Best");
		review.setReviewRating(4);
		review.setFurniture(new Furniture(34,"blue","wingback chair","chair",456.0));
		assertEquals(review.getComments(),feedbackService.addReview(review).getComments());
	}
	
	@Test
	void testGetAlltReview() throws CustomerFeedbackException{
		assertNotNull(feedbackService.getAllReviews());
	
	}
	
	

}
