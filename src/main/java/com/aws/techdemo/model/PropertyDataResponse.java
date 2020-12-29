package com.aws.techdemo.model;

import java.util.List;

public class PropertyDataResponse {
	private int totalRecords;
	private List<ListProperty> propertiesData;
	
	public int getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}
	public List<ListProperty> getPropertiesData() {
		return propertiesData;
	}
	public void setPropertiesData(List<ListProperty> propertiesData) {
		this.propertiesData = propertiesData;
	}
	
	

}
