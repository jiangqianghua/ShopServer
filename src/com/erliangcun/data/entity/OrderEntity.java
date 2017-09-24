package com.erliangcun.data.entity;

/**
 * ���ɶ�������
 * @author user
 *
 */
public abstract class OrderEntity {

	/**
	 * ����id
	 */
	private String order_id ; 
	/**
	 * Ӧ֧�����  ��λ��ЧС��
	 */
	private double payment ;
	
	/**
	 * ֧������  1 ����֧��  2 ����֧��
	 */
	private int payment_type ;
	
	/**
	 * ����״̬
	 * 1 δ֧��  �� 2 ��֧�� �� 3 δ�ͻ�  �� 4 �Ѿ�����  ��5 ���׳ɹ� �� 6���׹ر�
	 */
	private int status ;
	/**
	 * ����ʱ��
	 */
	private long create_time ; 
	/**
	 * ����ʱ��
	 */
	private long update_time ; 
	/**
	 * ����ʱ��
	 */
	private long payment_time ; 
	/**
	 *  ����ʱ��
	 */
	private long consig_time ;
	/**
	 *  ����
	 */
	private long end_time ;
	/**
	 * ���id
	 */
	private String user_id;
	/**
	 * �������
	 */
	private String buyer_message ; 
	/**
	 * ����ǳ�
	 */
	private String user_nick ; 
	
	/**
	 * ��������
	 */
	private String shop_name ;
	
	/**
	 * ����Ƿ��Ѿ�����
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
