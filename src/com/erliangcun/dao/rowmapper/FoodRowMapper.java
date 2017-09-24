package com.erliangcun.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import vo.FoodVo;

public class FoodRowMapper implements RowMapper<FoodVo>{

	@Override
	public FoodVo mapRow(ResultSet rs, int rowNum) throws SQLException {
		FoodVo foodVo = new FoodVo();
		foodVo.setId(rs.getInt("id"));
		foodVo.setName(rs.getString("name"));
		foodVo.setDes(rs.getString("des"));
		foodVo.setImageurl(rs.getString("imageurl"));
		foodVo.setNum(rs.getInt("num"));
		foodVo.setPrice(rs.getDouble("price"));
		foodVo.setShopId(rs.getInt("shopid"));
		foodVo.setType(rs.getInt("type"));
		return foodVo;
	}

}
