package com.erliangcun.data.entity;
/**
 * 
 * @author user
 *
 */
public class OrderDetail {
	/**
	 * id
	 */
	private long id ;
	/**
	 * ��Ʒid
	 */
	private String item_id ; 
	/**
	 * ����id
	 */
	private String order_id ; 
	/**
	 * ��Ʒ����
	 */
	private int num ; 
	/**
	 * ��Ʒ����
	 */
	private String title ;
	/**
	 * ��Ʒ����
	 */
	private double price;
	/**
	 * ��Ʒ�ܼ۸�
	 */
	private double total_price ;
	/**
	 * ��ƷͼƬ
	 */
	private String pic_path ;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getItem_id() {
		return item_id;
	}
	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotal_price() {
		return total_price;
	}
	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}
	public String getPic_path() {
		return pic_path;
	}
	public void setPic_path(String pic_path) {
		this.pic_path = pic_path;
	}
	
	
	
	
}
