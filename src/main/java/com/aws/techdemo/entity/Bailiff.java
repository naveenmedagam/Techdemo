package com.aws.techdemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
@Entity(name="private_bailiffs")
public class Bailiff {
	
	@Id
	private int privateBailiffId;
	private String privateBailiffNameEng;
	private String privateBailiffNameBg;
	private boolean privateBailiffIsactive;
	
	public int getPrivateBailiffId() {
		return privateBailiffId;
	}
	public void setPrivateBailiffId(int privateBailiffId) {
		this.privateBailiffId = privateBailiffId;
	}
	public String getPrivateBailiffNameEng() {
		return privateBailiffNameEng;
	}
	public void setPrivateBailiffNameEng(String privateBailiffNameEng) {
		this.privateBailiffNameEng = privateBailiffNameEng;
	}
	public String getPrivateBailiffNameBg() {
		return privateBailiffNameBg;
	}
	public void setPrivateBailiffNameBg(String privateBailiffNameBg) {
		this.privateBailiffNameBg = privateBailiffNameBg;
	}
	public boolean isPrivateBailiffIsactive() {
		return privateBailiffIsactive;
	}
	public void setPrivateBailiffIsactive(boolean privateBailiffIsactive) {
		this.privateBailiffIsactive = privateBailiffIsactive;
	}
	

}
