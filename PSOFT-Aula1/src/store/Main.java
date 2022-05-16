package store;

import services.ProductService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product leite = new Product("Leite", "Italac");
		Product cafe = new Product("Cafe", "São Braz");
		Product acucar = new Product("Açucar", "União");
		Product acucarMasc = new Product("Açucar Mascavo", "União");
		
		ProductService service = new ProductService();
		
		service.getProdRepo().create(leite.getId(), leite);
		service.getProdRepo().create(cafe.getId(), cafe);
		service.getProdRepo().create(acucar.getId(), acucar);
		service.getProdRepo().create(acucarMasc.getId(), acucarMasc);
		
		System.out.println(service.listProdByName("Cafe"));
	}

}
