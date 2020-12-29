package com.aws.techdemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "property_types")
public class PropertyType {
	@Id
	private int propertyTypeId;
	private String propertyTypeNameEng;
    private String propertyTypeNameBg;
    private boolean propertyTypeIsactive;
    
	
	public int getPropertyTypeId() {
		return propertyTypeId;
	}
	public void setPropertyTypeId(int propertyTypeId) {
		this.propertyTypeId = propertyTypeId;
	}
	public String getPropertyTypeNameEng() {
		return propertyTypeNameEng;
	}
	public void setPropertyTypeNameEng(String propertyTypeNameEng) {
		this.propertyTypeNameEng = propertyTypeNameEng;
	}
	public String getPropertyTypeNameBg() {
		return propertyTypeNameBg;
	}
	public void setPropertyTypeNameBg(String propertyTypeNameBg) {
		this.propertyTypeNameBg = propertyTypeNameBg;
	}
	public boolean isPropertyTypeIsactive() {
		return propertyTypeIsactive;
	}
	public void setPropertyTypeIsactive(boolean propertyTypeIsactive) {
		this.propertyTypeIsactive = propertyTypeIsactive;
	}
	
    
    
	

}
