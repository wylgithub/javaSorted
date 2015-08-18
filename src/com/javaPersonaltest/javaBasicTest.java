package com.javaPersonaltest;

import java.util.ArrayList;
import java.util.Scanner;

public class javaBasicTest {
/**
 * 题目1：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，
 * 问每个月的兔子对数为多少？  
 * 程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....
 */
	public static int _getSumOfRabbit(int n){
		if(n == 1 || n == 2){
			return 1;
		}
		else{
			//递归调用函数
			return _getSumOfRabbit(n-1) + _getSumOfRabbit(n - 2);
		}
	}
	
	
	//判断是否为素数
	public static boolean isPrime(int n){
		boolean flag = true;
		if(n == 1){
			flag = false;
		}
		else{
			for(int i = 2; i<=(Math.sqrt(n));i++){
				if(n%i == 0 || n==1){
					flag = false;
					break;
				}
				else{
					flag = true;
				}
			}
		}
		return flag;
	}
	
	/**
	 * 题目：判断101-200之间有多少个素数，并输出所有素数。 
	程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，
	如果能被整除，则表明此数不是素数，反之是素数。
	 */
	public static void getPrime(int n){
		//用于存储素数的个数
		int countPrime = 0;
		//循环获取所有的素数并输出
		for(int i = 1;i <= n;i++){
			if(isPrime(i)){
				countPrime++;
				System.out.print(i+" ");
				if(countPrime % 10 == 0){
					System.out.println();
			}
		}
	}

  }
	
	/**
	 * 求指定一个数是不是水仙花数
	 */
	public static void isLouts(int num){
		/**
		 * 首先要求键盘输入一个数然后分别获得 这个数的个位数，十位数，百位数
		 * 分别求他们的立方求和
		 */
		//声明一个泛型数组
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		//得到百位数
		int theUnit = num/100;
		System.out.println("百位数是:"+theUnit);
		//获取十位数
		int midTens = (num%100)/10;
		System.out.println("十位数是:"+midTens);
		//获取个位数
		int unitsDigit = (num%100)%10;
		System.out.println("个位数是:"+unitsDigit);
		
		int sumOfSquare = (int)Math.pow(theUnit, 3) + (int)Math.pow(midTens, 3) 
		+ (int)Math.pow(unitsDigit, 3);
		
		if(sumOfSquare == num){
			System.out.println("数字:"+num+"是水仙花数！");
		}else{
			System.out.println("Sorry！这不是一个水仙花数！");
		}
	}
	/**
	 * 测试指定一个三位数是不是水仙花数:求一个范围内的水仙花数
	 */
	public static void isLoutsTwo(int number){
		/**
		 * 首先要求键盘输入一个数然后分别获得 这个数的个位数，十位数，百位数
		 * 分别求他们的立方求和
		 */
		//声明一个泛型数组
		ArrayList<Integer> array = new ArrayList<Integer>();
		//声明一个数组用于存储水仙花数
		int [] arr = new int[100];//这种方式必须指定个数的数组局限性太强了
		//每行输出5个数
		int n = 0;
		for(int num = number;num<1000;num++){
			//得到百位数
			int theUnit = num/100;
//			System.out.println("百位数是:"+theUnit);
			//获取十位数
			int midTens = (num%100)/10;
//			System.out.println("十位数是:"+midTens);
			//获取个位数
			int unitsDigit = (num%100)%10;
//			System.out.println("个位数是:"+unitsDigit);
			
			int sumOfSquare = (int)Math.pow(theUnit, 3) + (int)Math.pow(midTens, 3) 
			+ (int)Math.pow(unitsDigit, 3);
			if(sumOfSquare == num){
				array.add(sumOfSquare);
				
			}else{
				continue;
			}
		  }
		for(int j:array){
			n++;
			System.out.println(j+" ");
			if(n%5 == 0){
				System.out.println();
			}
		}
		}
	
	/**
	 * 将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。 
	 */
	public static void splitData(int n){
		System.out.println(n+"=");
		for(int i = 2;i<n+1;i++){
			while(n%i == 0 &&n != i){
				n /= i;
				System.out.print(i+" * ");
			}
			if(n==i){
				System.out.println(i);
				break;
			}
		}
	}
	
	/**
	 * 题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，
	 */
	public static void getGrade(double grade) throws Exception{
		if(grade < 0 || grade >100){
			System.out.println("成绩非法，请重新输入自己的成绩！");
		}else{
			try{
				String str = (grade>=90)?"分，属于A等级":((grade>60)?"分,属于B等级":"分，属于C等级");
				System.out.println(grade+" "+str);
			}
			catch(Exception ex){
				throw ex("请输入正确的分数！");
			}
			finally{
				System.out.println("输入非法！");
			}
		}
		
	}
	private static Exception ex(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
  }
