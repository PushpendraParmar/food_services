package org.food.supplier.service;

import java.util.List;

import org.food.supplier.views.EnquiryView;

public interface EnquiryService {
	
	EnquiryView getEnquiryById(Long id);
	
	List<EnquiryView> getAllEnquiry();
	
	Boolean saveEnquiry(EnquiryView enquiryView);
}
