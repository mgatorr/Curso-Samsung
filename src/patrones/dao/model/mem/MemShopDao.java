package patrones.dao.model.mem;

import patrones.dao.entity.Shop;
import patrones.dao.model.ShopDao;

public class MemShopDao extends MemGenericDao<Shop, Integer> implements ShopDao {

	@Override
	public Integer getId(Shop entity) {
		// TODO Auto-generated method stub
		return entity.getId();
	}

}
