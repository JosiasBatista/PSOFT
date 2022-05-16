package store;

import java.util.concurrent.atomic.AtomicInteger;

public class Product {
	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
	
	public Product(String name, String manufacturer) {
		this.id = String.valueOf(ID_GENERATOR.getAndIncrement());
		this.name = name;
		this.manufacturer = manufacturer;
	}
	
	private String id;
	private String name;
	private String manufacturer;
	
	public String getName() {
		return this.name;
	}
	
	public String getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return this.name + " " + this.manufacturer;
	}
}
