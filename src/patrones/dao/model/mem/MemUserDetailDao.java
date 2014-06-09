package patrones.dao.model.mem;

import patrones.dao.entity.UserDetail;
import patrones.dao.model.UserDetailDao;

public class MemUserDetailDao extends MemGenericDao<UserDetail, Integer> implements
		UserDetailDao {

	@Override
	public Integer getId(UserDetail entity) {
		// TODO Auto-generated method stub
		return entity.getId();
	}



}
