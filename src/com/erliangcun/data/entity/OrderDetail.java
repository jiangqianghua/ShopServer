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
	 * 商品id
	 */
	private String item_id ; 
	/**
	 * 订单id
	 */
	private String order_id ; 
	/**
	 * 商品数量
	 */
	private int num ; 
	/**
	 * 商品标题
	 */
	private String title ;
	/**
	 * 商品单价
	 */
	private double price;
	/**
	 * 商品总价格
	 */
	private double total_price ;
	/**
	 * 商品图片
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
