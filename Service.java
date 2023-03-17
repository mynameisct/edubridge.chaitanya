package com.service;

import java.util.ArrayList;

import com.dao.Dao;

public class Service {
	
public ArrayList<Integer> getRollNumber() {
	 
		Dao dd = new Dao();
		ArrayList<Integer> al = dd.getRollNumber();
		return al;
	}
}
