package day05;
/*���������еĲ�����������
 * 1�������ǻ�����������
 * 2��������������������
 * 
 */
public class MethodoverLoadMethod_2 {
public static void main(String[] args) {
	/*int a=1;
	int b=2;
	change(a, b);
	System.out.println(a);
	System.out.println(b);*/
	int[] arr={1,2,3,4};
	System.out.println(arr[2]);
	change(arr);
	System.out.println(arr[2]);
}
public static void change(int[] arr){
	arr[2]=100;
}

public static void change(int a,int b){
	a=a+b;
	b=b+a;
}
}
