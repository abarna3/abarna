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

	@GetMapping("/feedback/custName/{custName}")
	public List<Feedback> getFeedbacksByCustName(@PathVariable("custName") String custName) {
		
		return service.getFeedbacksByCustName(custName);
	}
	@GetMapping("/feedback/custRating/{custRating}")
	public List<Feedback> getFeedbacksByCustRating(@PathVariable("custRating") int custRating) {
		
		return service.getFeedbacksByCustRating(custRating);
	}
	@DeleteMapping("/feedback/{custId}")
	public void deleteFeedbackByCustId(@PathVariable("custId") int custId) {
		service.deleteFeedbackByCustId(custId);
		
	}

	
}
