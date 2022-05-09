package store;

import java.util.concurrent.atomic.AtomicInteger;

public class Product {
	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
	
	public Product(String nome, String fabricante) {
		this.id = String.valueOf(ID_GENERATOR.getAndIncrement());
		this.nome = nome;
		this.fabricante = fabricante;
	}
	
	private String id;
	private String nome;
	private String fabricante;

	@Override
	public String toString() {
		return this.nome + " " + this.fabricante;
	}
}
