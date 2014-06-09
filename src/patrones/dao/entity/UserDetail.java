package patrones.dao.entity;

public class UserDetail {

	private Integer id;
	private String detail;
	private User user;

	public UserDetail(Integer id, String detail, User user) {
		super();
		this.setId(id);
		this.setDetail(detail);
		this.setUser(user);
	}

	public Integer getId() {
		return id;
	}

	private void setId(Integer id) {
		this.id = id;
	}

	public String getDetail() {
		return detail;
	}

	private void setDetail(String detail) {
		this.detail = detail;
	}

	public User getUser() {
		return user;
	}

	private void setUser(User user) {
		this.user = user;
	}

}
