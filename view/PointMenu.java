package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;
import com.kh.practice.point.model.vo.Circle;

public class PointMenu {
	
	public int getinput() {
		return getinput();
	}
	
	public int getxNum() {
		return getxNum();
	}
	public int getyNum() {
		return getyNum();
	}
	public void result(double result) {
		System.out.println("결과 : "+result);
	}

	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
	boolean isTrue= true;
	public void mainMenu() {
		while(isTrue) {
			int num = sc.nextInt();
			if(num==1) {
				circleMenu();
				break;
			}else if(num==2) {
				rectangleMenu();
				break;
			}else if(num==9) {
				System.out.print("메뉴를 다시 입력해주세요 : ");
			}
		}
}
	public void circleMenu() {
		while(isTrue) {
		int num = sc.nextInt();
		if(num==1) {
			calcCircum();
			break;
		}else if(num==2) {
			calcCircleArea();
			break;
		}else if(num==9) {
			System.out.print("메뉴를 다시 입력해주세요 : ");
			}
		}
	}
	public void rectangleMenu() {
		while(isTrue) {
			int num = sc.nextInt();
			if(num==1) {
				calcPerimeter();
				break;
			}else if(num==2) {
				calcRectArea();
				break;
			}else if(num==3) {
				System.out.print("메뉴를 다시 입력해주세요 : ");
				}
			}
		
		
	}
	public void calcCircum() {//둘레
		
	}
	public void calcCircleArea() {//면적
		
	}
	
	public void calcPerimeter() {//사각형 둘레
	}
	
	public void calcRectArea() {//사각형 넓이
		
	}

}
