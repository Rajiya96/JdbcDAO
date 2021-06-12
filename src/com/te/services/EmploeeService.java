package com.te.services;

import com.te.bean.EmploeeData;

public interface EmploeeService {
public EmploeeData getSingleRecord(int id);
public void getAllRecords();
public void insertRecord(EmploeeData e);
}
