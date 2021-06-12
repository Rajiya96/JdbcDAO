package com.te.dao;

import com.te.bean.EmploeeData;

public interface EmploeeDAO {
 public EmploeeData getsingleRecord(int id);
 public void getAllRecords();
 public void inserRecord(EmploeeData e);
}
