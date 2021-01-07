package com.aws.techdemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "district_courts")
public class DistrictCourts {
	@Id
	private int districtCourtId;
	public int getDistrictCourtId() {
		return districtCourtId;
	}
	public void setDistrictCourtId(int districtCourtId) {
		this.districtCourtId = districtCourtId;
	}
	public String getDistrictCourtNameEng() {
		return districtCourtNameEng;
	}
	public void setDistrictCourtNameEng(String districtCourtNameEng) {
		this.districtCourtNameEng = districtCourtNameEng;
	}
	public String getDistrictCourtNameBg() {
		return districtCourtNameBg;
	}
	public void setDistrictCourtNameBg(String districtCourtNameBg) {
		this.districtCourtNameBg = districtCourtNameBg;
	}
	public boolean isDistrictCourtIsactive() {
		return districtCourtIsactive;
	}
	public void setDistrictCourtIsactive(boolean districtCourtIsactive) {
		this.districtCourtIsactive = districtCourtIsactive;
	}
	private String 	districtCourtNameEng;
	private String districtCourtNameBg;
	private boolean districtCourtIsactive;
	
	

}
