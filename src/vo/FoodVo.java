package vo;

public class FoodVo {

	private int id ;
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
	
	/**
	 * 店铺id
	 */
	private int shopId ;
	
	private int type ; 
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
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}

	
}
