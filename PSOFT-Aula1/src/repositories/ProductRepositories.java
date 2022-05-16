package repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import store.Product;

public class ProductRepositories {
	
	private Map<String, Product> products;
	
	public ProductRepositories() {
		this.products = new HashMap<String, Product>();
	}
	
	public void create(String id, Product product) {
		this.products.put(id, product);
	}
	
	public Product read(String id) {
		return this.products.get(id);
	}
	
	public void update(String id, Product product) {
		this.products.put(id, product);
	}
	
	public void delete(String id) {
		this.products.remove(id);
	}
	
	public List<Product> getAll() {
		return new ArrayList<>(this.products.values());
	}
}
