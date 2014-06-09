package patrones.dao.model.mem;

import patrones.dao.entity.Category;
import patrones.dao.model.CategoryDao;

public class MemCategoryDao extends MemGenericDao<Category, Integer> implements
		CategoryDao {

	@Override
	public Integer getId(Category entity) {
		// TODO Auto-generated method stub
		return entity.getId();
	}

}
