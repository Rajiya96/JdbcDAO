package com.te.dao;

public class GetDaoImpl {
String type="jdbc";
public EmploeeDAO getDaoImpl()
{
	if(type.equalsIgnoreCase("jdbc")) {
		return new EmploeeDAOJDBCImpl();
	}else if(type.equalsIgnoreCase("hibernate")) {
		return new EmploeeDAOHIBERNATEImpl();
	}else if(type.equalsIgnoreCase("spring")) {
		return new EmploeeDAOSPRINGImpl();

	}
	return null;
	
}
}
