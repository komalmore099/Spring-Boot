package com.sky.repository;

import java.util.List;

import com.sky.domain.Product;

public interface ProductRepository 
{
	public void addProduct(Product product);
	public List<Product> getProducts();
	public Product getProductByid(String id);
	public Product deleteById(String id);
	public Product UpdateById(Product NProd);
	

}
