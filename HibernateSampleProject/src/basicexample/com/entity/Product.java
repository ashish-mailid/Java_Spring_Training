package basicexample.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries(  
	    {  
	        @NamedQuery(  
	        name = "findProductByName",  
	        query = "from Product p where p.name = :name"  
	        )  
	    }  
	)  

@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int code;
private String name;
private double price;
private long stock;
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
@Override
public String toString() {
	return "Product [code=" + code + ", name=" + name + ", price=" + price
			+ ", stock=" + stock + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public long getStock() {
	return stock;
}
public void setStock(long stock) {
	this.stock = stock;
}
public Product(int code, String name, double price, long stock) {
	super();
	this.code = code;
	this.name = name;
	this.price = price;
	this.stock = stock;
}
public Product() {
	super();
}

}
