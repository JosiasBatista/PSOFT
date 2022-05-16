package services;

import java.util.List;
import java.util.stream.Collectors;

import repositories.BatchRepositories;
import repositories.ProductRepositories;
import store.Batch;
import store.Product;

public class ProductService {
	
	BatchRepositories batchRepo;
	ProductRepositories prodRepo;
	
	public ProductService() {
		batchRepo = new BatchRepositories();
		prodRepo = new ProductRepositories();
	}
	
	public ProductRepositories getProdRepo() {
		return this.prodRepo;
	}
	
	public List<Product> listBatchProducts(String name) {
		List<Batch> batches = batchRepo.getAll();
		List<Product> products = getProdsFromBatches(batches);
		List<Product> prodsInBatches = getProdsByName(name, products);
		
		return prodsInBatches;
	}
	
	public List<Product> listProdByName(String name) {
		List<Product> prods = prodRepo.getAll();
		List<Product> prodsByName = getProdsByName(name, prods);
		
		return prodsByName;
	}
	
	private List<Product> getProdsFromBatches(List<Batch> batches) {
		List<Product> prods = batches.stream()
			.map(batch -> batch.getProduct())
			.collect(Collectors.toList());
		
		return prods;
	}

	private List<Product> getProdsByName(String name, List<Product> products) {
		List<Product> prodList = products.stream()
			.filter(prod -> prod.getName().matches(String.format(".*%s.*", name)))
			.collect(Collectors.toList());
		
		return prodList;
	}
}
