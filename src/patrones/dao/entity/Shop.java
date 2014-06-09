package patrones.dao.entity;

public class Shop {
	private Integer id;
	private int amount;
	private String description;
	private ShoppingBasket shoppingBasket;

	public Shop(Integer id, int amount, String description,
			ShoppingBasket shoppingBasket) {
		super();
		this.setId(id);
		this.setAmount(amount);
		this.setDescription(description);
		this.setShoppingBasket(shoppingBasket);
	}

	public Integer getId() {
		return id;
	}

	public int getAmount() {
		return amount;
	}

	public String getDescription() {
		return description;
	}

	public ShoppingBasket getShoppingBasket() {
		return shoppingBasket;
	}

	private void setId(Integer id) {
		this.id = id;
	}

	private void setAmount(int amount) {
		this.amount = amount;
	}

	private void setDescription(String description) {
		this.description = description;
	}

	private void setShoppingBasket(ShoppingBasket shoppingBasket) {
		this.shoppingBasket = shoppingBasket;
	}

}
