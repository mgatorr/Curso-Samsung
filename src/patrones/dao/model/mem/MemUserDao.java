package patrones.dao.model.mem;

import patrones.dao.entity.User;
import patrones.dao.model.UserDao;

public class MemUserDao extends MemGenericDao<User, Integer> implements UserDao {

	@Override
	public Integer getId(User entity) {
		// TODO Auto-generated method stub
		return entity.getId();
	}

}
