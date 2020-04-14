package com.two;

public class Book {
	String title;
	String author;

	public void print() {
		System.out.println(title + "," + author);
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public Book(String title) {
		this(title, "작자미상");// 여기에서의 this는 다른 생성자 호출
	}

	public static void main(String[] args) {
		Book LittlePrince = new Book("어린왕자", "생텍쥐페리");
		LittlePrince.print();
		Book LoveStroy = new Book("춘향전");
		LoveStroy.print();
	}
}
