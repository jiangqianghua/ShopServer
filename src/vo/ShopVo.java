package vo;

public class ShopVo {
	
	private int id = 0;
	/**
	 * 店铺名字
	 */
	private String name ; 
	/**
	 * 店铺地址
	 */
	private String address ; 
	/**
	 * 店铺开始时间
	 */
	private long startTime ; 
	
	/**
	 * 店铺关闭时间
	 */
	private long endTime ; 
	/**
	 * 经度
	 */
	private long latitude  ; 
	/**
	 * 维度
	 */
	private long longitude  ;
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
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public long getEndTime() {
		return endTime;
	}
	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}
	public long getLatitude() {
		return latitude;
	}
	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}
	public long getLongitude() {
		return longitude;
	}
	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
	

	
	
	
}
