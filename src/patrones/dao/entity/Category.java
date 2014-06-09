package patrones.dao.entity;

public class Category {
	private Integer id;
	private String name;
	private String description;

	public Category(Integer id, String name, String description) {
		this.setId(id);
		this.setName(name);
		this.setDescription(description);
	}

	public Integer getId() {
		return id;
	}

	private void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	private void setDescription(String description) {
		this.description = description;
	}
}
