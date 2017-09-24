package com.erliangcun.service;

import vo.FoodVo;
import vo.ShopVo;

import java.util.List;

import com.erliangcun.data.entity.ShopEntity;

public interface ShopService {

	/**
	 * 保存店铺信息
	 * @param shopvo
	 */
	public boolean saveShop(ShopVo shopvo);
	
	/**
	 * 获取所有店铺信息
	 * @return
	 */
	public List<ShopVo> allShop();
	
	public boolean saveFood(FoodVo foodVo);
	
	public List<FoodVo> allFood(int shopId);
	
	public boolean deleteFoodById(int id);
}
