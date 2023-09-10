package com.kh.practice.point.run;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.model.vo.Circle;
import com.kh.practice.point.model.vo.Rectangle;
import com.kh.practice.point.view.PointMenu;
import com.kh.practice.point.controller.RectangleController;

public class Run {

	public static void main(String[] args) {
		
		Circle c =new Circle();
		
		Rectangle rectangle = new Rectangle();
		
		PointMenu pointMenu = new PointMenu();

		CircleController controller= new CircleController();
		
		controller.run();
		
	}

}
