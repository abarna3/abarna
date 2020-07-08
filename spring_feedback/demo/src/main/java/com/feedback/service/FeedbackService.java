package com.feedback.service;

import java.util.List;

import com.feedback.model.Feedback;

public interface FeedbackService {
	
	public Feedback createFeedback(Feedback feedback);
	public Feedback updateFeedback(Feedback feedback);
	public List<Feedback> getAllFeedbacks();
	public List<Feedback> getFeedbacksByCust_rating(int cust_rating);
	public void deleteFeedback(int cust_id);
	

}
