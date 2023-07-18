package com.LiveasyLogistic.LiveasyLogistic.loadData;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//import java.util.UUID;

@Entity
public class load {	
	@Id
	long loadId;
	@Column
	String shipperId;
	@Column
	String loadingpoint;
	@Column
	String unloadingPoint;
	@Column
	String productType;
	@Column
	String truckType;
	@Column
	long noOfTrucks;
	@Column
	double weight;
	@Column
	String comment;
	@Column
	String Date;
	


	public long getLoadId() {
		return loadId;
	}


	public void setLoadId(long loadId) {
		this.loadId = loadId;
	}


	public String getLoadingpoint() {
		return loadingpoint;
	}


	public void setLoadingpoint(String loadingpoint) {
		this.loadingpoint = loadingpoint;
	}


	public String getUnloadingPoint() {
		return unloadingPoint;
	}


	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}


	public String getProductType() {
		return productType;
	}


	public void setProductType(String productType) {
		this.productType = productType;
	}


	public String getTruckType() {
		return truckType;
	}


	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}


	public long getNoOfTrucks() {
		return noOfTrucks;
	}


	public void setNoOfTrucks(long noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public String getDate() {
		return Date;
	}


	public void setDate(String date) {
		this.Date = date;
	}


	@Override
	public String toString() {
		return "load [shipperId=" + shipperId + ", loadingpoint=" + loadingpoint + ", unloadingPoint=" + unloadingPoint
				+ ", productType=" + productType + ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks
				+ ", weight=" + weight + ", comment=" + comment + ", Date=" + Date + "]";
	}


	public String getShipperId() {
		return shipperId;
	}


	public void setShipperId(String shipperId) {
		this.shipperId = shipperId;
	}	
	
	
	
}
