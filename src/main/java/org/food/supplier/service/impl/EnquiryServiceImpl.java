package org.food.supplier.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.food.supplier.dao.EnquiryDao;
import org.food.supplier.domain.Enquiry;
import org.food.supplier.service.EnquiryService;
import org.food.supplier.views.EnquiryView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EnquiryServiceImpl implements EnquiryService {

	@Autowired
	private EnquiryDao enquiryDAO;
	
	@Override
	@Transactional
	public EnquiryView getEnquiryById(Long id) {
		// TODO Auto-generated method stub
		return  EnquiryView.toView(enquiryDAO.getEnquirytById(id));
	}

	@Override
	public List<EnquiryView> getAllEnquiry() {
		// TODO Auto-generated method stub
		List<Enquiry> enqList=enquiryDAO.getEnquiries();
		List<EnquiryView> enqViewList=new ArrayList<EnquiryView>(enqList.size());
		for( Enquiry enq: enqList) {
			enqViewList.add(EnquiryView.toView(enq));
		}
		
		return enqViewList;
	}

	@Override
	public Boolean saveEnquiry(EnquiryView enquiryView) {
		// TODO Auto-generated method stub
		enquiryDAO.save(EnquiryView.toEntity(enquiryView));
		return Boolean.TRUE;
	}

}
