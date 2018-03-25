package org.food.supplier.views;

import org.food.supplier.domain.Product;

public class ProductView {

	private Integer productId;

	private String name;

	private float price;

	private Float weight;

	private String sku;

	private String cartDesc;

	private String shortDesc;

	private String longDesc;
	
	private String imageName;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getCartDesc() {
		return cartDesc;
	}

	public void setCartDesc(String cartDesc) {
		this.cartDesc = cartDesc;
	}

	public String getShortDesc() {
		return shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	public String getLongDesc() {
		return longDesc;
	}

	public void setLongDesc(String longDesc) {
		this.longDesc = longDesc;
	}
	
	
	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public static Product toEntity(ProductView productView){
		Product prod = new Product();
		prod.setLongDesc(productView.getLongDesc());
		prod.setName(productView.getName());
		prod.setProductId(productView.getProductId());
		prod.setImageName(productView.getImageName());
		return prod;
		
	}
	public static ProductView toView(Product product){
		ProductView view = new ProductView();
		view.setLongDesc(product.getLongDesc());
		view.setName(product.getName());
		view.setProductId(product.getProductId());
		view.setImageName(product.getImageName());
		return view;
		
	}

}
