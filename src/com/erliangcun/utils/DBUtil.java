package com.erliangcun.utils;

import vo.FoodVo;
import vo.ShopVo;

public class DBUtil {

	//insert into shop(name,address,start_time,end_time,latitude,longitude) values("duanpu1","beijin",100,100,100,100);
	public final static String INSTART_SHOP_SQL = "insert into shop(name,address,start_time,end_time,latitude,longitude) values(?,?,?,?,?,?)";
	public final static String ALL_SHOP_SQL = "select *from shop";
	public final static String INSERT_FOOD_SQL = "insert into food(name,imageurl,num,price,des,shopid,type) values(?,?,?,?,?,?,?)";
	public final static String ALL_FOOD_SQL = "select * from food where shopid=?";
	public final static String DELETE_FOOD_ID_SQL = "delete from food where id=?";
	public static Object[] getShopParams(ShopVo shopEntity)
	{
		return new Object[]{shopEntity.getName(),shopEntity.getAddress(),shopEntity.getStartTime(),
				shopEntity.getEndTime(),shopEntity.getLatitude(),shopEntity.getLongitude()};
	}
	
	public static Object[] getFoodParams(FoodVo foodVo)
	{
		return new Object[]{foodVo.getName(),foodVo.getImageurl(),foodVo.getNum(),
				foodVo.getPrice(),foodVo.getDes(),foodVo.getShopId(),foodVo.getType()};
	}

	
	public static Object[] getShopParamsTypes()
	{
		return new Object[]{java.sql.Types.VARCHAR,java.sql.Types.VARCHAR,java.sql.Types.BIGINT,
				java.sql.Types.BIGINT,java.sql.Types.BIGINT,java.sql.Types.BIGINT};
	}

}
