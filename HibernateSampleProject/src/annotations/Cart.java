package annotations;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 
@Entity
@Table(name="CART")
public class Cart {
 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="cart_id")
    private long id;
     
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	@Column(name="total")
    private double total;
     
    @Column(name="name")
    private String name;
     
    @OneToMany(mappedBy="cart")
    private Set<Item> items;
     
// Getter Setter methods for properties
}