package com.aws.techdemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name = "properties")
public class Property {

	@Id
	private int propertyId;
	private String price;
	private String priceInEur;
	private String address;
	private String publishedDate;
	private String legacyPropertyId;
	private String description;
	//private String propertyType;
	//private String listingAgent;
	private String lon;
	private String lat;
	//private String imageUrl;
	public int getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPriceInEur() {
		return priceInEur;
	}
	public void setPriceInEur(String priceInEur) {
		this.priceInEur = priceInEur;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}
	public String getLegacyPropertyId() {
		return legacyPropertyId;
	}
	public void setLegacyPropertyId(String legacyPropertyId) {
		this.legacyPropertyId = legacyPropertyId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLon() {
		return lon;
	}
	public void setLon(String lon) {
		this.lon = lon;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	
	
	
	
	
	
	
	
	
	
	

}
