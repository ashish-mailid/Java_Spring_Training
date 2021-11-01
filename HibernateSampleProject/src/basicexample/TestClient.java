package basicexample;

import basicexample.com.dao.ProductDao;
import basicexample.com.pojo.Product;

public class TestClient {

	public static void main(String[] args) {
		ProductDao p=new ProductDao();
		//System.out.println(p.getAllProducts());
		Product p1=new Product();
		p1.setCode(101);p1.setName("jam"); p1.setPrice(100); p1.setStock(100);
		System.out.println(p.addProduct(p1));
		
		System.out.println(p.getAllProducts());
	}

}
