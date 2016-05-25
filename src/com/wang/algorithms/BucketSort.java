package com.wang.algorithms;

import java.util.Scanner;

public class BucketSort {
	public static void main(String[] args) {
		int[] book = new int[11];
		for (int i = 0; i < book.length; i++) {
			book[i] = 0; // 初始化为0
		}
		int[] a = { 5, 3, 4, 2, 8 };
		for(int i = 0;i<a.length;i++){
			book[a[i]]=a[i];
		}
		for (int i : a) {
			System.out.println(i);
		}
	}
}
