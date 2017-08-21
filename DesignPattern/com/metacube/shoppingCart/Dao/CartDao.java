package com.metacube.shoppingCart.Dao;

import com.metacube.shoppingCart.Entity.CartProduct;

public interface CartDao extends BaseDao<CartProduct> 
{
	public void editProductQuantity(int productId, int quantity);
}
