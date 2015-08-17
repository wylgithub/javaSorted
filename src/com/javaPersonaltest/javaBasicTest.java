package com.javaPersonaltest;

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
	
}
