package com.te.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.te.bean.EmploeeData;

public class EmploeeDAOJDBCImpl implements EmploeeDAO{

	@Override
	public EmploeeData getsingleRecord(int id) {
		EmploeeData empdata=new EmploeeData();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 String dburl="jdbc:mysql://localhost:3306/emp";
			 Connection con=DriverManager.getConnection(dburl,"root","root");
			 Statement stmt=con.createStatement();
	          String q="select * from studentvalues where id="+id+";";
	          ResultSet rs=stmt.executeQuery(q);
		         while(rs.next()) {
		        	 empdata.setId(rs.getInt("id"));
		        	 empdata.setName(rs.getString("name"));
		        	 empdata.setMarks(rs.getInt("marks"));
		        	 empdata.setAge(rs.getString("age"));
		        	 empdata.setPhonenum(rs.getInt("Phonenum"));
		         }
		        	 

		}catch(Exception e) {
			e.printStackTrace();
		}
		return empdata;
	}

	@Override
	public void getAllRecords() {
		System.out.println("ssss");
	}

	@Override
	public void inserRecord(EmploeeData e) {
		System.out.println("dddd");

		
	}

	

}

	
