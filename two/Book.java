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
		this(title, "���ڹ̻�");// ���⿡���� this�� �ٸ� ������ ȣ��
	}

	public static void main(String[] args) {
		Book LittlePrince = new Book("�����", "�������丮");
		LittlePrince.print();
		Book LoveStroy = new Book("������");
		LoveStroy.print();
	}
}
