package store;

import java.util.concurrent.atomic.AtomicInteger;

public class Batch {
	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
	
	public Batch(Product product, Integer amount) {
		this.id = String.valueOf(ID_GENERATOR.getAndIncrement());
		this.product = product;
		this.amount = amount;
	}
	
	private String id;
	private Product product;
	private Integer amount;
	
	@Override
	public String toString() {
		return "Lote " + this.product + " - " + String.valueOf(this.amount) + " unidades";
	}
	
	public Product getProduct() {
		return this.product;
	}
}
