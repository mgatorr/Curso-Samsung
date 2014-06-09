package patrones.dao.model;

import java.util.Map;

public interface GenericDao<T, ID> {
	public void create(T entity);
	public T read(ID id);
	public void update(T entity);
	public void delete(T entity);
	public void deleteByID(ID id);
	public Map<ID,T> findAll();
	public Map<ID,T> findAll(int index,int size);
}
