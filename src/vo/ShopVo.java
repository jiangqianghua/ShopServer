package vo;

public class ShopVo {
	
	private int id = 0;
	/**
	 * ��������
	 */
	private String name ; 
	/**
	 * ���̵�ַ
	 */
	private String address ; 
	/**
	 * ���̿�ʼʱ��
	 */
	private long startTime ; 
	
	/**
	 * ���̹ر�ʱ��
	 */
	private long endTime ; 
	/**
	 * ����
	 */
	private long latitude  ; 
	/**
	 * ά��
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
