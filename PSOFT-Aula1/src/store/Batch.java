package store;

import java.util.concurrent.atomic.AtomicInteger;

public class Batch {
	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
	
	public Batch(Product produto, Integer quantidade) {
		this.id = String.valueOf(ID_GENERATOR.getAndIncrement());
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	private String id;
	private Product produto;
	private Integer quantidade;
	
	@Override
	public String toString() {
		return "Lote " + this.produto + " - " + String.valueOf(this.quantidade) + " unidades";
	}
}
