package com.erliangcun.service.impl;

import vo.FoodVo;
import vo.ShopVo;

import java.util.List;

import com.erliangcun.dao.ShopDao;
import com.erliangcun.service.ShopService;

public class ShopServiceImpl implements ShopService{

	private ShopDao shopDao ;
	
	
	public void setShopDao(ShopDao shopDao) {
		this.shopDao = shopDao;
	}


	@Override
	public boolean saveShop(ShopVo shopvo) {
		
		return shopDao.insertShop(shopvo);
		
	}


	@Override
	public List<ShopVo> allShop() {
		return shopDao.allShops();
	}


	@Override
	public boolean saveFood(FoodVo foodVo) {
		
		return shopDao.saveFood(foodVo);
	}


	@Override
	public List<FoodVo> allFood(int shopId) {
		return shopDao.allFood(shopId);
	}


	@Override
	public boolean deleteFoodById(int id) {
		return shopDao.deleteFood(id);
	}


}
