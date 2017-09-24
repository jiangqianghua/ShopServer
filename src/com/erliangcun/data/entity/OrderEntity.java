package com.erliangcun.data.entity;

/**
 * 生成订单对象
 * @author user
 *
 */
public abstract class OrderEntity {

	/**
	 * 订单id
	 */
	private String order_id ; 
	/**
	 * 应支付金额  两位有效小数
	 */
	private double payment ;
	
	/**
	 * 支付类型  1 在线支付  2 货到支付
	 */
	private int payment_type ;
	
	/**
	 * 订单状态
	 * 1 未支付  ， 2 已支付 ， 3 未送货  ， 4 已经发货  ，5 交易成功 ， 6交易关闭
	 */
	private int status ;
	/**
	 * 创建时间
	 */
	private long create_time ; 
	/**
	 * 更新时间
	 */
	private long update_time ; 
	/**
	 * 付款时间
	 */
	private long payment_time ; 
	/**
	 *  发货时间
	 */
	private long consig_time ;
	/**
	 *  交易
	 */
	private long end_time ;
	/**
	 * 买家id
	 */
	private String user_id;
	/**
	 * 买家留言
	 */
	private String buyer_message ; 
	/**
	 * 买家昵称
	 */
	private String user_nick ; 
	
	/**
	 * 店铺名称
	 */
	private String shop_name ;
	
	/**
	 * 买家是否已经评价
	 */
	private String buyer_rate ;
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public double getPayment() {
		return payment;
	}
	public void setPayment(double payment) {
		this.payment = payment;
	}
	public int getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(int payment_type) {
		this.payment_type = payment_type;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public long getCreate_time() {
		return create_time;
	}
	public void setCreate_time(long create_time) {
		this.create_time = create_time;
	}
	public long getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(long update_time) {
		this.update_time = update_time;
	}
	public long getPayment_time() {
		return payment_time;
	}
	public void setPayment_time(long payment_time) {
		this.payment_time = payment_time;
	}
	public long getConsig_time() {
		return consig_time;
	}
	public void setConsig_time(long consig_time) {
		this.consig_time = consig_time;
	}
	public long getEnd_time() {
		return end_time;
	}
	public void setEnd_time(long end_time) {
		this.end_time = end_time;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getBuyer_message() {
		return buyer_message;
	}
	public void setBuyer_message(String buyer_message) {
		this.buyer_message = buyer_message;
	}
	public String getUser_nick() {
		return user_nick;
	}
	public void setUser_nick(String user_nick) {
		this.user_nick = user_nick;
	}
	public String getBuyer_rate() {
		return buyer_rate;
	}
	public void setBuyer_rate(String buyer_rate) {
		this.buyer_rate = buyer_rate;
	}
	public String getShop_name() {
		return shop_name;
	}
	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	} 

	
	
	
}
