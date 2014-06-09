package patrones.dao.entity;

import java.util.Date;
import java.util.Set;

public class ShoppingBasket {

	private Integer id;
	private Date date;
	private Set<Shop> shops;

	public ShoppingBasket(Integer id, Date date) {
		super();
		this.setDate(date);
		this.setId(id);
	}

	public Integer getId() {
		return id;
	}

	private void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	private void setDate(Date date) {
		this.date = date;
	}

	public Set<Shop> getShops() {
		return shops;
	}

}
