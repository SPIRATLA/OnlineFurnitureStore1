package com.Repository;
import com.Entity.*;     
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface FeedbackRepository extends JpaRepository<Review, Integer>
{
	//int findReviewByRating(int reviewRating);
}