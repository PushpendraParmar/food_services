package org.food.supplier.endpoint;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.food.supplier.views.ProductView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/product/")
public interface ProductEndPoint {
	
	@RequestMapping(value="{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	public ProductView getProductDetails( Integer id);
	
	@RequestMapping(value="save", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON)
	public Boolean getSaveProduct( ProductView productView);
	
	@RequestMapping(value="products", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	public List<ProductView> getAllProduct();
}
