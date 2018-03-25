package org.food.supplier.dao.impl;

import java.util.List;

import org.food.supplier.dao.ProductDAO;
import org.food.supplier.domain.Product;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAOImpl extends AbstractDao<Integer, Product> implements ProductDAO{

	@Override
	public Product getProductById(Integer id) {
		Product product = getByKey(id);
		return product;
	}
	
	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		Criteria criteria = createEntityCriteria();
		List<Product> products =  (List<Product>)criteria.list();
		return products;
	}
	
	@Override
	public void save(Product product) {
		persist(product);
	}

	
	
}
