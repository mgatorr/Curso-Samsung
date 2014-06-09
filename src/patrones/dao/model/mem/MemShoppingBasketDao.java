package patrones.dao.model.mem;

import patrones.dao.entity.ShoppingBasket;
import patrones.dao.model.ShoppingBasketDao;

public class MemShoppingBasketDao extends
		MemGenericDao<ShoppingBasket, Integer> implements ShoppingBasketDao {

	@Override
	public Integer getId(ShoppingBasket entity) {
		// TODO Auto-generated method stub
		return entity.getId();
	}



}
