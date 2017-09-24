package com.erliangcun.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.erliangcun.dao.ShopDao;
import com.erliangcun.dao.rowmapper.FoodRowMapper;
import com.erliangcun.dao.rowmapper.ShopRowMapper;
import com.erliangcun.data.entity.ShopEntity;
import com.erliangcun.log.LogUtil;
import com.erliangcun.utils.DBUtil;
import com.erliangcun.utils.GeneralUtils;

import vo.FoodVo;
import vo.ShopVo;

public class ShopDaoImpl extends JdbcDaoSupport implements ShopDao {

	// 添加店铺到数据库中
	
	@Override
	public boolean insertShop(ShopVo shopEntity) {
		LogUtil.log("insert into" +shopEntity.getName());
		String sql = DBUtil.INSTART_SHOP_SQL ;
		try
		{
		int result = this.getJdbcTemplate().update(sql,
				DBUtil.getShopParams(shopEntity)
				);
		LogUtil.log("insert result" + result);
		}catch(Exception e)
		{
			//e.printStackTrace();
			LogUtil.log(e.getMessage());
			return false ;
		}
		return true;
	}

	@Override
	public List<ShopVo> allShops() {
		String sql = DBUtil.ALL_SHOP_SQL; 
		return this.getJdbcTemplate().query(sql, new ShopRowMapper());
	}

	@Override
	public boolean saveFood(FoodVo foodVo) {
		
		LogUtil.log("insert into food " +foodVo.getName());
		String sql = DBUtil.INSERT_FOOD_SQL ;
		try
		{
		int result = this.getJdbcTemplate().update(sql,
				DBUtil.getFoodParams(foodVo)
				);
		LogUtil.log("insert result" + result);
		}catch(Exception e)
		{
			//e.printStackTrace();
			LogUtil.log(e.getMessage());
			return false ;
		}
		return true;
	}

	@Override
	public List<FoodVo> allFood(int shopId) {
		String sql = DBUtil.ALL_FOOD_SQL; 
		return this.getJdbcTemplate().query(sql,new Object[]{shopId},new FoodRowMapper());
	}

	@Override
	public boolean deleteFood(int id) {
		String sql = DBUtil.DELETE_FOOD_ID_SQL ; 
		int result = this.getJdbcTemplate().update(sql,new Object[]{id});
		if(result == 0)
			return false; 
		else
			return true; 
	}
	
	
	
	

	
	
}
