package com.feedback.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.feedback.model.Feedback;

@Service
public interface FeedbackService {
	
	public Feedback createFeedback(Feedback feedback);
	public Feedback updateFeedback(Feedback feedback);
	public List<Feedback> getAllFeedbacks();
	public List<Feedback> getFeedbacksByCustName(String custName);
	public List<Feedback> getFeedbacksByCustRating(int custRating);
	public void deleteFeedbackByCustId(int custId);
	

}
