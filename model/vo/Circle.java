package com.kh.practice.point.model.vo;

public class Circle {

	int radius ;

	
	
	public void setRadius(int radius) {
			this.radius = radius;
		}

	public double calcCircum() {//둘레
		return radius*3.14;
		
	}
	public double calcCircleArea() {//면적
		return radius*radius*3.14;
		
	}


}
