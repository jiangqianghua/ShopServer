package com.erliangcun.dao;

import java.util.List;

import com.erliangcun.data.entity.ShopEntity;

import vo.FoodVo;
import vo.ShopVo;

public interface ShopDao {

	
	public boolean insertShop(ShopVo shopEntity);
	
	public List<ShopVo> allShops();
	
	public boolean saveFood(FoodVo foodVo);
	
	public List<FoodVo> allFood(int shopId);
	
	public boolean deleteFood(int id);
}
