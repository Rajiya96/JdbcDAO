package com.te.services;

import com.te.bean.EmploeeData;
import com.te.dao.EmploeeDAO;
import com.te.dao.GetDaoImpl;

public class EmploeeServiceImpl  implements EmploeeService{
	 GetDaoImpl daoImpl=new GetDaoImpl();
	 EmploeeDAO dao=daoImpl.getDaoImpl();

	@Override
	public EmploeeData getSingleRecord(int id) {
		// TODO Auto-generated method stub
		if(id<0)
		{
		return null;
	}else {
		System.out.println("emmploee service laer"+id);
	}
		return dao.getsingleRecord(id);
	}

	@Override
	public void getAllRecords() {
		// TODO Auto-generated method stub
		
		System.out.println("fecc all records");

		
	}

	@Override
	public void insertRecord(EmploeeData e) {
		// TODO Auto-generated method stub
		System.out.println("insered");

		
	}
}
