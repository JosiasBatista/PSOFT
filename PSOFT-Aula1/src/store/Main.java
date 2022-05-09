package store;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product leite = new Product("Leite", "Italac");
		Batch lote = new Batch(leite, 10);
		
		System.out.println(leite);
		
		System.out.println(lote);
	}

}
