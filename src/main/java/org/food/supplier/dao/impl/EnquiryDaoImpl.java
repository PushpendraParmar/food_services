package org.food.supplier.dao.impl;

import java.util.List;

import org.food.supplier.dao.EnquiryDao;
import org.food.supplier.domain.Enquiry;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

@Repository
public class EnquiryDaoImpl extends AbstractDao<Long, Enquiry> implements EnquiryDao {
	
	@Override
	public Enquiry getEnquirytById(Long id) {
		Enquiry enquiry = getByKey(id);
		return enquiry;
	}
	
	@Override
	public List<Enquiry> getEnquiries() {
		// TODO Auto-generated method stub
		Criteria criteria = createEntityCriteria();
		List<Enquiry> enquiry =  (List<Enquiry>)criteria.list();
		return enquiry;
	}
	
	@Override
	public void save(Enquiry enquiry) {
		persist(enquiry);
	}
}
