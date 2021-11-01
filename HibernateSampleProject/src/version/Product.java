package version;

import java.util.Date;

public class Product {
private int code;
private String name;
private double price;
public long getVersionId() {
	return versionId;
}
public void setVersionId(long versionId) {
	this.versionId = versionId;
}
private long stock;
private long versionId;

/*private Date version;

public Date getVersion() {
	return version;
}
public void setVersion(Date version) {
	this.version = version;
}*/
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
