package com.aws.techdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
@Entity
@Table(name = "properties")
public class Property {

	@Id
	@Column(name = "property_id")
	private int propertyId;

	@Column(name = "price")
	private String price;
	@Column(name = "price_in_eur")
	private String priceInEur;

	@Column(name = "address")
	private String address;

	@Column(name = "published_date")
	private String publishedDate;

	@Column(name = "area")
	private String area;

	@Column(name = "description")
	private String description;

	@Column(name = "extras")
	private String extras;

	@Column(name = "property_floor")
	private String propertyFloor;

	@Column(name = "term")
	private String term;
	
	@Column(name = "announcement_of")
	private String announcementDate;
	
	@Column(name = "maps_coorinate_url")
	private String mapsCoorinateUrl;

	@Column(name="lon")
	private String lon;

	@Column(name = "lat")
	private String lat;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "district_id")
	private District district;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "property_type_id")
	private PropertyType propertType;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "private_bailiff_id")
	private Bailiff bailiff;

	// private String imageUrl;
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

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public PropertyType getPropertType() {
		return propertType;
	}

	public void setPropertType(PropertyType propertType) {
		this.propertType = propertType;
	}

	public Bailiff getBailiff() {
		return bailiff;
	}

	public void setBailiff(Bailiff bailiff) {
		this.bailiff = bailiff;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
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


}
