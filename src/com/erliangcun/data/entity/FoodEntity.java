package com.erliangcun.data.entity;

/**
 * 菜的实例对象
 * @author user
 *
 */
public class FoodEntity {
	
	/**
	 * 菜图片
	 */
	private String imageurl ; 
	/**
	 * 菜名
	 */
	private String name ; 
	/**
	 * 数量
	 */
	private int num ;
	/**
	 * 单价
	 */
	private double price ;
	/*
	 *描述
	 */
	private String des;
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	
	
	

}
