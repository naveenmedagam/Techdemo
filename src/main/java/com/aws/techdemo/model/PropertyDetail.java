package com.aws.techdemo.model;

//@JsonInclude(Include.NON_NULL)
public class PropertyDetail {
	
	
	private int propertyId;

	private String price;
	private String priceInEur;
	
	private String address;
	
	private String publishedDate;
	
	private String buildUpArea;
	
	private String propertyType;
	
	private String listingAgent;
	
	private String description;
	
	private String lon;
	
	private String lat;
	
	private String image;
	private String extras;
	private String propertyFloor;
	private String term;
	private String announcementDate;
	private String mapsCoorinateUrl;
	

	public String getExtras() {
		return extras;
	}

	public void setExtras(String extras) {
		this.extras = extras;
	}

	public String getPropertyFloor() {
		return propertyFloor;
	}

	public void setPropertyFloor(String propertyFloor) {
		this.propertyFloor = propertyFloor;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public String getAnnouncementDate() {
		return announcementDate;
	}

	public void setAnnouncementDate(String announcementDate) {
		this.announcementDate = announcementDate;
	}

	public String getMapsCoorinateUrl() {
		return mapsCoorinateUrl;
	}

	public void setMapsCoorinateUrl(String mapsCoorinateUrl) {
		this.mapsCoorinateUrl = mapsCoorinateUrl;
	}

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

	public String getBuildUpArea() {
		return buildUpArea;
	}

	public void setBuildUpArea(String buildUpArea) {
		this.buildUpArea = buildUpArea;
	}

	public String getListingAgent() {
		return listingAgent;
	}

	public void setListingAgent(String listingAgent) {
		this.listingAgent = listingAgent;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
}
