package day05;

import java.util.Random;

/*
 * 实现点名器
 * 1、存储姓名
 * 2、预览所有学生姓名，遍历数组
 * 3、随机打印学生名
 * 将功能独立出来，做成方法，调用方法
 */
public class CallName {
	public static void main(String[] args) {
		String[] names=new String[10];
		AddStudent(names);
		printStudentName(names);
		String name=randomStudentName(names);
		System.out.println(name);
		
	}
	/*
	 * 定义方法，数组添加学生
	 */
	public static void AddStudent(String[] names){
		names[0]="123";
		names[0]="1223";
		names[0]="122223";
		names[0]="1222223";
		names[0]="12333333";
		names[0]="126666663";
		
	}
	/*
	 * 遍历数组
	 */
	public static void printStudentName(String[] names){
		for (int i = 0; i < names.length; i++) {
			System.out.println(names);
			
		}
	}
	public static String randomStudentName(String[] names){
		Random random=new Random();
		int index=random.nextInt(names.length);
		return names[index];
				
	}

}
