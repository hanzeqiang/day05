package day05;

import java.util.Scanner;


/* 
 * 方法定义和使用
 * 1、定义无返回值参数，打印3行，每行3个*号的矩形
 */
public class MethodDemo_1 {
	//1、定义无返回值参数，打印3行，每行3个*号的矩形
	public static void getTe(){
	for (int i = 0; i <3; i++) {
		for (int j = 0; j < 3; j++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
}
//2、定义有返回值无参数方法，如键盘录入得到一个整数明确方法计算后结果的类型值为int
	public static int getNumber(){
		
		Scanner sc=new Scanner(System.in);
		return sc.nextInt();
		
	}
	//3、定义无返回值有参数方法，打印M*N个*号
	public static void print2(int m,int n){
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
	//4、求三个数平均值
	public static int getAverage(int a,int b ,int c){
		int average=(a+b+c)/3;
		return average;
		
	}
public static void main(String[] args) {
	//getTe();

	//System.out.println(getNumber());
	//print2(4, 7);
	System.out.println(getAverage(5, 6, 8));
	
	
}

}
