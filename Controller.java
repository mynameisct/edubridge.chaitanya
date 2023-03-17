package com.controller;

import java.util.ArrayList;

import com.service.Service;

public class Controller {
	
	void getRollNumber() {
		
		Service ss = new Service();
		ArrayList<Integer> al = ss.getRollNumber();
		
		System.out.println(al);
	}
	public static void main(String[] args) {
			Controller cc = new Controller();
			cc.getRollNumber();
	}
}
