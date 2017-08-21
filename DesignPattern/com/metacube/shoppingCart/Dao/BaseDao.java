package com.metacube.shoppingCart.Dao;

import java.util.Map;

import com.metacube.shoppingCart.Entity.BaseEntity;

public interface BaseDao<T extends BaseEntity> 
{

	/**
	 * Add entity to the list
	 * 
	 * @param entityId
	 * @param entity
	 *            - BaseEntity Object
	 */
	void add(int entityId, BaseEntity entity);

	/**
	 * Remove entity from the list
	 * 
	 * @param entityId
	 */
	void remove(int entityId);

	/**
	 * @return the Map of Entity
	 */
	Map<Integer, BaseEntity> getList();
}
