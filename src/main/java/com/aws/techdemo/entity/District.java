package com.aws.techdemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "districts")
public class District {
	@Id
	private int districtId;
	private String 	districtNameEng;
	private String districtNameBg;
	private boolean districtIsactive;
	public int getDistrictId() {
		return districtId;
	}
	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}
	public String getDistrictNameEng() {
		return districtNameEng;
	}
	public void setDistrictNameEng(String districtNameEng) {
		this.districtNameEng = districtNameEng;
	}
	public String getDistrictNameBg() {
		return districtNameBg;
	}
	public void setDistrictNameBg(String districtNameBg) {
		this.districtNameBg = districtNameBg;
	}
	public boolean isDistrictIsactive() {
		return districtIsactive;
	}
	public void setDistrictIsactive(boolean districtIsactive) {
		this.districtIsactive = districtIsactive;
	}
	
	

}
