package com.feedback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.feedback.model.Feedback;
import com.feedback.service.FeedbackService;

@RestController
public class FeedbackController {
	
	@Autowired
	private FeedbackService service;
	
	@PostMapping("/feedback")
	public Feedback createFeedback(@RequestBody Feedback feedback) {
		
		return service.createFeedback(feedback);
	}
	
	@PutMapping("/feedback")
	public Feedback updateFeedback(@RequestBody Feedback feedback) {
		
		return service.updateFeedback(feedback);
	}
	
	@GetMapping("/feedbacks")
	public List<Feedback> getAllFeedbacks() {
		
		return service.getAllFeedbacks();
	}

	@GetMapping("/feedback/cust_rating/{cust_rating}")
	public List<Feedback> getFeedbacksByCust_rating(@PathVariable("cust_rating") int cust_rating) {
		
		return service.getFeedbacksByCust_rating(cust_rating);
	}
	
	@DeleteMapping("/feedback/{cust_id}")
	public void deleteFeedback(@PathVariable("cust_id") int cust_id) {
		service.deleteFeedback(cust_id);
		
	}

	
}
