package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {

	Rectangle r =new Rectangle ();
	
	private RectangleController model;
	private RectangleController view;
	public RectangleController(RectangleController model,RectangleController view) {
		this.model = model;
		this.view = view;
	}
	public void run() {
	
		int input =view.getxNum();
		model.setRadius(input);
		
		int input =view.getyNum();
		model.setRadius(input);
		
		
		double result = model.calcCircum();
		double result2 = model.calcCircleArea();
	}
	
	
}
