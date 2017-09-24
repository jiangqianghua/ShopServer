package com.erliangcun.data.entity;
/**
 * 订单配送
 * @author user
 *
 */
public class OrderShipEntity {

	/**
	 * id
	 */
	private long id ;
	/**
	 * 订单id
	 */
	private String order_id;
	/**
	 * 收获名字
	 */
	private String receiver_name ; 
	/**
	 * 收获电话
	 */
	private String receiver_phone ;
	/**
	 * 收获地址
	 */
	private String receiver_address ; 
	/**
	 * 创建时间
	 */
	private long created ; 
	/**
	 * 更新时间
	 */
	private long update ;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getReceiver_name() {
		return receiver_name;
	}
	public void setReceiver_name(String receiver_name) {
		this.receiver_name = receiver_name;
	}
	public String getReceiver_phone() {
		return receiver_phone;
	}
	public void setReceiver_phone(String receiver_phone) {
		this.receiver_phone = receiver_phone;
	}
	public String getReceiver_address() {
		return receiver_address;
	}
	public void setReceiver_address(String receiver_address) {
		this.receiver_address = receiver_address;
	}
	public long getCreated() {
		return created;
	}
	public void setCreated(long created) {
		this.created = created;
	}
	public long getUpdate() {
		return update;
	}
	public void setUpdate(long update) {
		this.update = update;
	}
	
	
}
