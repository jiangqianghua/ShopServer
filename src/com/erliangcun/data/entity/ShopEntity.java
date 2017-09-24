package com.erliangcun.data.entity;

public class ShopEntity {
	
	/**
	 * 店铺名字
	 */
	private String name ; 
	/**
	 * 店铺地址
	 */
	private String address ; 
	/**
	 * 店铺
	 */
	private long start_time ; 
	
	/**
	 * 关闭时间
	 */
	private long end_time ; 
	/**
	 * 经度
	 */
	private String latitude  ; 
	/**
	 * 维度
	 */
	private String longitude  ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getStart_time() {
		return start_time;
	}
	public void setStart_time(long start_time) {
		this.start_time = start_time;
	}
	public long getEnd_time() {
		return end_time;
	}
	public void setEnd_time(long end_time) {
		this.end_time = end_time;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	
	
	
	

}
