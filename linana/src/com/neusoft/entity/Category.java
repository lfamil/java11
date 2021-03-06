package com.neusoft.entity;

import java.util.Date;

public class Category {
private int id;
private int parent_id;
private String name;
private int status=1;
private int sort_order;
private Date create_time;
private Date update_time;
public Category() {
	super();
	// TODO Auto-generated constructor stub
}
public Category(int id, int parent_id, String name, int status, int sort_order, Date create_time, Date update_time) {
	super();
	this.id = id;
	this.parent_id = parent_id;
	this.name = name;
	this.status = status;
	this.sort_order = sort_order;
	this.create_time = create_time;
	this.update_time = update_time;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getParent_id() {
	return parent_id;
}
public void setParent_id(int parent_id) {
	this.parent_id = parent_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
public int getSort_order() {
	return sort_order;
}
public void setSort_order(int sort_order) {
	this.sort_order = sort_order;
}
public Date getCreate_time() {
	return create_time;
}
public void setCreate_time(Date create_time) {
	this.create_time = create_time;
}
public Date getUpdate_time() {
	return update_time;
}
public void setUpdate_time(Date update_time) {
	this.update_time = update_time;
}

}
