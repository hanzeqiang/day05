package day05;
/*
 * 方法重载
 * 在同一个类中，允许出现同名的方法，只要方法的参数列表不同即可，这就是方法重载
 */
public class MethodoverLoadMethod {
	public static void main(String[] args) {
		System.out.println(getSum(5.0, 9.3));
		
	}


public static int getSum(int a,int b){
	System.out.println("两个int参数");
	return a+b;
	
}
public static int getSum(int a,int b ,int c){
	System.out.println("三个int参数");
	return a+b+c;
	
}
public static double getSum(double a,double b){
	System.out.println("两个double参数");
	return a+b;
}
}