package com.zettamine.day4;

public class Hosteller {
	
	private String hostelName;
	private int roomNum;
	
	public Hosteller(String hostelName, int roomNum) {
		this.hostelName = hostelName;
		this.roomNum = roomNum;
	}
	
	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

}
