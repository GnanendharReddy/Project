package com.deloitte.Lensmart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Lensmart {

	@Id
	@GeneratedValue
	private Integer lensId;
	private String lensType;
	private double lensPrice;
	public Lensmart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lensmart(Integer lensId, String lensType, double lensPrice) {
		super();
		this.lensId = lensId;
		this.lensType = lensType;
		this.lensPrice = lensPrice;
	}
	public Integer getLensId() {
		return lensId;
	}
	public void setLensId(Integer lensId) {
		this.lensId = lensId;
	}
	public String getLensType() {
		return lensType;
	}
	public void setLensType(String lensType) {
		this.lensType = lensType;
	}
	public double getLensPrice() {
		return lensPrice;
	}
	public void setLensPrice(double lensPrice) {
		this.lensPrice = lensPrice;
	}
	@Override
	public String toString() {
		return "Lensmart [lensId=" + lensId + ", lensType=" + lensType + ", lensPrice=" + lensPrice + "]";
	}
	
	
}
