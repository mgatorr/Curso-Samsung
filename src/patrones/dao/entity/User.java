package patrones.dao.entity;

public class User {

	private Integer id;
	private String name;
	private String password;
	private int level;
	private UserDetail userDetail;

	public User(Integer id, String name, String password, int level) {
		super();
		this.setId(id);
		this.setName(name);
		this.setPassword(password);
		this.setLevel(level);
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

	public String getPassword() {
		return password;
	}

	private void setPassword(String password) {
		this.password = password;
	}

	public int getLevel() {
		return level;
	}

	private void setLevel(int level) {
		this.level = level;
	}

	public UserDetail getUserDetail() {
		return userDetail;
	}

}
