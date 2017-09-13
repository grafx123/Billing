package com.Inventary.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Inventary.dao.DBConnection;

public class SubCategoryBean {
	DBConnection dbConnection = new DBConnection();
	Connection connection = dbConnection.getConnection();
	PreparedStatement stmt = null;
	ResultSet result = null;
	private int subCategoryId;
	private int categoryId;
	private String categoryName;
	private String subCategoryName;
	public int getSubCategoryId() {
		return subCategoryId;
	}
	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
		String categoryName = getCategoryName(this.categoryId);
		setCategoryName(categoryName);
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getSubCategoryName() {
		return subCategoryName;
	}
	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}
	
	public String getCategoryName(int categoryId){
		String categoryName = null;
		try{
		stmt = connection.prepareStatement("SELECT `categoryname` FROM `category` WHERE `categoryid`=?");
		stmt.setInt(1, categoryId);
		result = stmt.executeQuery();
		if(result.next()){
			categoryName = result.getString("categoryname");
		}
		connection.close();
		}catch(Exception e){
			System.out.println(e);
		}
		return categoryName;
	}
}
