package br.com.fiap.dao;

import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.KeyNotFoundException;

public interface GenericDAO<T,K> {

	void create(T entity);
	T read(K id);
	void update(T entity);
	void delete(K id) throws KeyNotFoundException;
	
	void commit() throws CommitException;
}
