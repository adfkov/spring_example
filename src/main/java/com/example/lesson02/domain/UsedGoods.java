package com.example.lesson02.domain;

import java.util.Date;

// DTO, model , 
public class UsedGoods {
	// 필드
	private int id;
	private int ment;
	private int price;
	private int lastment;
	private Date createdAt;
	private Date updatedAt;
	private int sellerId;
	
	// 메소드
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMent() {
		return ment;
	}
	public void setMent(int ment) {
		this.ment = ment;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getLastment() {
		return lastment;
	}
	public void setLastment(int lastment) {
		this.lastment = lastment;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
}
