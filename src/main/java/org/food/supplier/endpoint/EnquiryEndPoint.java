package org.food.supplier.endpoint;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.food.supplier.views.EnquiryView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/enquiry/")
public interface EnquiryEndPoint {

	@RequestMapping(value="{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	public EnquiryView getEnquiryDetails(Long id);
	
	@RequestMapping(value="save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON)
	public Boolean saveEnquiry( EnquiryView enquiryView);
	
	@RequestMapping(value="getEnquiries", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	public List<EnquiryView> getAllEnquiry();
}
