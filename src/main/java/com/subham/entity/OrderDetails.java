package com.subham.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "orderdetails")
public class OrderDetails {
	
	@Id
	@Column(name = "mobilnumber")
	private String mobilenumber;
	private String name;
	private String village;
	private String menuitem;
	private int platecount;
	
	
	//getter setter
	public String getMobilnumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getMenuitem() {
		return menuitem;
	}
	public void setMenuitem(String menuitem) {
		this.menuitem = menuitem;
	}
	public int getPlatecount() {
		return platecount;
	}
	public void setPlatecount(int platecount) {
		this.platecount = platecount;
	}
	
	//toString
	@Override
	public String toString() {
		return "OrderDetails [mobilenumber=" + mobilenumber + ", name=" + name + ", village=" + village + ", menuitem="
				+ menuitem + ", platecount=" + platecount + "]";
	}
	
	
	

}
