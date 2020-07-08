package com.feedback.serviceimpl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feedback.dao.FeedbackDao;
import com.feedback.model.Feedback;
import com.feedback.service.FeedbackService;

@Service
public class FeedbackServiceImpl implements FeedbackService {
	
	@Autowired
	private FeedbackDao dao;

	@Override
	public Feedback createFeedback(Feedback feedback) {
		
		return dao.save(feedback);
	}

	@Override
	public Feedback updateFeedback(Feedback feedback) {
		
		return dao.save(feedback);
	}
	

	@Override
	public List<Feedback> getAllFeedbacks() {
		
		return dao.findAll();
	}

	@Override
	public List<Feedback> getFeedbacksByCust_rating(int cust_rating) {
		
		return dao.findByCust_rating(cust_rating);
	}

	@Override
	public void deleteFeedback(int cust_id) {
		dao.deleteById(cust_id);
		
	}

}
