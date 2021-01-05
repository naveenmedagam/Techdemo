package com.aws.techdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "property_images")
public class propertyImages {
	
	@Id
	@Column(name = "property_image_id")
	private int propertyImageId;
	
	@Column(name = "property_id")
	private int propertyId;
	
	@Column(name = "property_image_name")
	private String propertyImageName;
	
	@Column(name = "property_image_url")
	private String propertyImageUrl;
	
	@Column(name = "property_image_isactive")
	private boolean propertyImageIsActive;

	public int getPropertyImageId() {
		return propertyImageId;
	}

	public void setPropertyImageId(int propertyImageId) {
		this.propertyImageId = propertyImageId;
	}

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public String getPropertyImageName() {
		return propertyImageName;
	}

	public void setPropertyImageName(String propertyImageName) {
		this.propertyImageName = propertyImageName;
	}

	public String getPropertyImageUrl() {
		return propertyImageUrl;
	}

	public void setPropertyImageUrl(String propertyImageUrl) {
		this.propertyImageUrl = propertyImageUrl;
	}

	public boolean isPropertyImageIsActive() {
		return propertyImageIsActive;
	}

	public void setPropertyImageIsActive(boolean propertyImageIsActive) {
		this.propertyImageIsActive = propertyImageIsActive;
	}
	
	
	

}
