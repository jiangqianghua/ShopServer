package com.erliangcun.data.entity;

/**
 * �˵�ʵ������
 * @author user
 *
 */
public class FoodEntity {
	
	/**
	 * ��ͼƬ
	 */
	private String imageurl ; 
	/**
	 * ����
	 */
	private String name ; 
	/**
	 * ����
	 */
	private int num ;
	/**
	 * ����
	 */
	private double price ;
	/*
	 *����
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
