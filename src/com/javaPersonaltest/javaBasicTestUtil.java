package com.javaPersonaltest;

import java.util.Scanner;

public class javaBasicTestUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * 实例化一个类
		 */
		System.out.println("求兔子对数的练习:主要是练习函数的递归调用，这个有点像斐波拉契函数！");
		javaBasicTest jb = new javaBasicTest();
		Scanner console = new Scanner(System.in);
		System.out.println("请输入月份数:");
		int month = console.nextInt();
		long sumOfRabbit = jb._getSumOfRabbit(month);
		System.out.println(month+" 个月之后将会有: "+sumOfRabbit+"对兔子！");
		
		System.out.println("---请输入一个数用于求在该数以内素数的个数---");
		int n = console.nextInt();
		if(n != (int)n){
			System.out.println("输入非法，请重新输入！");
		}
		System.out.println("以下是所有素数的集合！");
		jb.getPrime(n);
	}

}
