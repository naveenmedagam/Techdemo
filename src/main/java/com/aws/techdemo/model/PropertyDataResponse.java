package com.aws.techdemo.model;

import java.util.List;

public class PropertyDataResponse {
	private int totalRecords;
	private List<PropertyData> propertiesData;
	
	public int getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}
	public List<PropertyData> getPropertiesData() {
		return propertiesData;
	}
	public void setPropertiesData(List<PropertyData> propertiesData) {
		this.propertiesData = propertiesData;
	}
	
	

}
