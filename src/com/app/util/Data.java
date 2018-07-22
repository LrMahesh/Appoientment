package com.app.util;

import java.sql.Timestamp;

public class Data{
	
	private Timestamp time;
	private String purposeOfApp;
	private String whom;
	private int phoneNumber;
	private String Address;
	private Timestamp startTime;
	private Timestamp endTime;
	
	
	
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public String getPurposeOfApp() {
		return purposeOfApp;
	}
	public void setPurposeOfApp(String purposeOfApp) {
		this.purposeOfApp = purposeOfApp;
	}
	public String getWhom() {
		return whom;
	}
	public void setWhom(String whom) {
		this.whom = whom;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Timestamp getStartTime() {
		return startTime;
	}
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}
	public Timestamp getEndTime() {
		return endTime;
	}
	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}
	@Override
	public String toString() {
		return "Data [time=" + time + ", purposeOfApp=" + purposeOfApp + ", whom=" + whom + ", phoneNumber="
				+ phoneNumber + ", Address=" + Address + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Address == null) ? 0 : Address.hashCode());
		result = prime * result + ((endTime == null) ? 0 : endTime.hashCode());
		result = prime * result + phoneNumber;
		result = prime * result + ((purposeOfApp == null) ? 0 : purposeOfApp.hashCode());
		result = prime * result + ((startTime == null) ? 0 : startTime.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		result = prime * result + ((whom == null) ? 0 : whom.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Data other = (Data) obj;
		if (Address == null) {
			if (other.Address != null)
				return false;
		} else if (!Address.equals(other.Address))
			return false;
		if (endTime == null) {
			if (other.endTime != null)
				return false;
		} else if (!endTime.equals(other.endTime))
			return false;
		if (phoneNumber != other.phoneNumber)
			return false;
		if (purposeOfApp == null) {
			if (other.purposeOfApp != null)
				return false;
		} else if (!purposeOfApp.equals(other.purposeOfApp))
			return false;
		if (startTime == null) {
			if (other.startTime != null)
				return false;
		} else if (!startTime.equals(other.startTime))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		if (whom == null) {
			if (other.whom != null)
				return false;
		} else if (!whom.equals(other.whom))
			return false;
		return true;
	}
	public Data(Timestamp time, String purposeOfApp, String whom, int phoneNumber, String address, Timestamp startTime,
			Timestamp endTime) {
		super();
		this.time = time;
		this.purposeOfApp = purposeOfApp;
		this.whom = whom;
		this.phoneNumber = phoneNumber;
		Address = address;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public Data() {
		super();
	}
	
	
	

}
