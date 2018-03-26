package org.food.supplier.dao;

import java.util.List;

import org.food.supplier.domain.Enquiry;

public interface EnquiryDao {
	Enquiry getEnquirytById(Long id);
	public List<Enquiry> getEnquiries();
	void save(Enquiry enquiry);

}


