package day05;
/*
 * ��������
 * ��ͬһ�����У��������ͬ���ķ�����ֻҪ�����Ĳ����б�ͬ���ɣ�����Ƿ�������
 */
public class MethodoverLoadMethod {
	public static void main(String[] args) {
		System.out.println(getSum(5.0, 9.3));
		
	}


public static int getSum(int a,int b){
	System.out.println("����int����");
	return a+b;
	
}
public static int getSum(int a,int b ,int c){
	System.out.println("����int����");
	return a+b+c;
	
}
public static double getSum(double a,double b){
	System.out.println("����double����");
	return a+b;
}
}