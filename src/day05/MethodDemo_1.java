package day05;

import java.util.Scanner;


/* 
 * ���������ʹ��
 * 1�������޷���ֵ��������ӡ3�У�ÿ��3��*�ŵľ���
 */
public class MethodDemo_1 {
	//1�������޷���ֵ��������ӡ3�У�ÿ��3��*�ŵľ���
	public static void getTe(){
	for (int i = 0; i <3; i++) {
		for (int j = 0; j < 3; j++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
}
//2�������з���ֵ�޲��������������¼��õ�һ��������ȷ�����������������ֵΪint
	public static int getNumber(){
		
		Scanner sc=new Scanner(System.in);
		return sc.nextInt();
		
	}
	//3�������޷���ֵ�в�����������ӡM*N��*��
	public static void print2(int m,int n){
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
	//4����������ƽ��ֵ
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
