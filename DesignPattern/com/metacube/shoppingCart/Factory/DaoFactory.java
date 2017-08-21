package com.metacube.shoppingCart.Factory;

import com.metacube.shoppingCart.Dao.BaseDao;
import com.metacube.shoppingCart.Dao.InMemoryCartDao;
import com.metacube.shoppingCart.Dao.InMemoryProductStoreDao;
import com.metacube.shoppingCart.Enum.DBType;
import com.metacube.shoppingCart.Enum.Entity;

public class DaoFactory
{

	public static BaseDao<?> getBaseDaoForEntity(Entity entityName, DBType dbType) 
	{
		switch (entityName) 
		{
			case Product:
			switch (dbType) 
			{
				case Inmemory:
					return InMemoryProductStoreDao.getInstance();
				default:
					break;
			}
			break;
			case Cart:
			switch (dbType) 
			{
				case Inmemory:
					return InMemoryCartDao.getInstance();
				default:
					break;
			}
			default:
			break;
		}
		return null;
	}
}
