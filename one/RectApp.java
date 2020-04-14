package com.one;
//class Rectangle{
//	int weight;
//	int height;
//	public int getArea() { 
//		//면적 구하기
//		return weight*height;
//	}
//}

public class RectApp {
	public static void main(String[] args) {
		Rectangle rect= new Rectangle();
		rect.weight=100;
		rect.height=50;
		//getArea를 호출
		int rArea = rect.getArea();
		System.out.println("rArea : " +rArea);
	}
}
