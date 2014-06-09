package patrones.dao.model.mem;

import java.util.HashMap;
import java.util.Map;

import patrones.dao.model.GenericDao;

public abstract class MemGenericDao<T, ID> implements GenericDao<T, ID> {
	private Map<ID, T> almacen = new HashMap<ID, T>();

	@Override
	public void create(T entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public T read(ID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(T entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteByID(ID id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<ID, T> findAll() {
		// TODO Auto-generated method stub
		return this.almacen;
	}

	@Override
	public Map<ID, T> findAll(int index, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	public abstract Integer getId(T entity);

}
