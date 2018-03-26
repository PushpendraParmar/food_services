package org.food.supplier.controller;

import java.util.List;

import org.food.supplier.endpoint.EnquiryEndPoint;
import org.food.supplier.service.EnquiryService;
import org.food.supplier.views.EnquiryView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin(origins = {"http://localhost:4200"})
public class EnquiryController implements EnquiryEndPoint {

	@Autowired
	private EnquiryService enquiryService;
	
	@Override
	public @ResponseBody EnquiryView getEnquiryDetails(@PathVariable(value = "id") Long id) {
		return enquiryService.getEnquiryById(id);
	}

	@Override
	public @ResponseBody Boolean saveEnquiry(@RequestBody EnquiryView enquiryView) {
		return enquiryService.saveEnquiry(enquiryView);
	}

	@Override
	public @ResponseBody List<EnquiryView> getAllEnquiry() {
		// TODO Auto-generated method stub
		return enquiryService.getAllEnquiry();
	}
	

}
