package annotations;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;

@Entity
@Table(name="ITEM")
public class Item {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getItemId() {
	return itemId;
}
public void setItemId(String itemId) {
	this.itemId = itemId;
}
public double getItemTotal() {
	return itemTotal;
}
public void setItemTotal(double itemTotal) {
	this.itemTotal = itemTotal;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public Cart getCart() {
	return cart;
}
public void setCart(Cart cart) {
	this.cart = cart;
}
@Column(name="item_id")
private String itemId;

@Column(name="item_total")
private double itemTotal;

@Column(name="quantity")
private int quantity;

	@ManyToOne
	@JoinColumn(name="cart_id", nullable=false)
	private Cart cart;


	public Item(){}
	public Item(String itemId, double itemTotal, int quantity,
			Cart cart) {
		super();
		this.itemId = itemId;
		this.itemTotal = itemTotal;
		this.quantity = quantity;
		this.cart = cart;
	}
	
	
//Getter Setter methods
}

