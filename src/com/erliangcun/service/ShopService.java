package com.erliangcun.service;

import vo.FoodVo;
import vo.ShopVo;

import java.util.List;

import com.erliangcun.data.entity.ShopEntity;

public interface ShopService {

	/**
	 * ���������Ϣ
	 * @param shopvo
	 */
	public boolean saveShop(ShopVo shopvo);
	
	/**
	 * ��ȡ���е�����Ϣ
	 * @return
	 */
	public List<ShopVo> allShop();
	
	public boolean saveFood(FoodVo foodVo);
	
	public List<FoodVo> allFood(int shopId);
	
	public boolean deleteFoodById(int id);
}
