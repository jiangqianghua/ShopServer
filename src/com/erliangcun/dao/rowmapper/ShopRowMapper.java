package com.erliangcun.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import vo.ShopVo;

/**
 * shop∫Õ ˝æ›ø‚”≥…‰
 * @author jiangqianghua
 *
 */
public class ShopRowMapper implements RowMapper<ShopVo> {

	@Override
	public ShopVo mapRow(ResultSet rs, int rowNum) throws SQLException {
		ShopVo shopVo = new ShopVo();
		shopVo.setId(rs.getInt("id"));
		shopVo.setName(rs.getString("name"));
		shopVo.setAddress(rs.getString("address"));
		shopVo.setStartTime(rs.getLong("start_time"));
		shopVo.setEndTime(rs.getLong("end_time"));
		shopVo.setLatitude(rs.getLong("latitude"));
		shopVo.setLongitude(rs.getLong("longitude"));
		return shopVo;
	}

}
