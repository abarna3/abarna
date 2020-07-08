package com.feedback.serviceimpl;

import java.util.List;

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
	public List<Feedback> getFeedbacksByCustRating(int custRating) {
		
		return dao.findByCustRating(custRating);
		
	}

	@Override
	public void deleteFeedbackByCustId(int custId) {
		dao.deleteById(custId);
		
	}

	@Override
	public List<Feedback> getFeedbacksByCustName(String custName) {
		
		return  dao.findByCustName(custName);
	}

}
