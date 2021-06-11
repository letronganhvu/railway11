package com.vti.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class News implements INews {
	int id;
	String title;
	String publishDate;
	String author;
	String content;
	float averageRate;
	int[] rates;

	public News() {
		super();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập title: ");
		this.title = sc.nextLine();
		System.out.println("Nhập PublishDate: ");
		this.publishDate = sc.nextLine();
		System.out.println("Nhập Author: ");
		this.author = sc.nextLine();
		System.out.println("Nhập Content: ");
		this.content = sc.nextLine();
		System.out.println("Nhập đánh giá 1");
		int rate1 = sc.nextInt();
		System.out.println("Nhập đánh giá 2");
		int rate2 = sc.nextInt();
		System.out.println("Nhập đánh giá 3");
		int rate3 = sc.nextInt();
		int[] rates = { rate1, rate2, rate3 };
		this.rates = rates;
	}

	public News(int id, String title, String publishDate, String author, String content, float averageRate,
			int[] rates) {
		super();
		this.id = id;
		this.title = title;
		this.publishDate = publishDate;
		this.author = author;
		this.content = content;
		this.averageRate = averageRate;
		this.rates = rates;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public float getAverageRate() {
		return averageRate;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("News [id=" + id + ", title=" + title + ", publishDate=" + publishDate + ", author=" + author
				+ ", content=" + content + ", averageRate=" + averageRate + "]");
	}

	@Override
	public float calculate() {
		averageRate = (float) ((rates[0] + rates[1] + rates[2]) / 3);
		return averageRate;

	}

	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + ", publishDate=" + publishDate + ", author=" + author
				+ ", content=" + content + ", averageRate=" + averageRate + "]";
	}

}
