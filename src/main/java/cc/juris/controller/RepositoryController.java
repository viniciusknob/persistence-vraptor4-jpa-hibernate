package cc.juris.controller;

public interface RepositoryController<T> {
	
	void add(T intance);
	void remove(Long id);
	T get(Long id);
	
}
