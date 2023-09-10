package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;
import com.kh.practice.point.view.PointMenu;

public class CircleController {

	private CircleController model;
	private CircleController view;
	
	public CircleController() {
		this.model = model;
		this.view = view;
	}

		
		public void run() {
			int input =view.getinput();
			model.setRadius(input);
			
			
			double result = model.calcCircum();
			double result2 = model.calcCircleArea();
		}

		
	
	
}
