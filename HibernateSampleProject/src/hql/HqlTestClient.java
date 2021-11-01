package hql;

public class HqlTestClient {

	public static void main(String[] args) {
		HqlDao dao=new HqlDao();
		//System.out.println(dao.getProductsPrice(100));
		System.out.println(dao.updateStockName(200,"nuts"));
	}

}
