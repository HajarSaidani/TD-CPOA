package com.iut.as.interfaces;

import java.util.List;


public interface IDao <T> {
	
	T read(String numeroClient);
	
	public abstract void create(T objet);
	public abstract void update(T objet);
	public abstract void delete(T objet);

	List<T> getList();


}
