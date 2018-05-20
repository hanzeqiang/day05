package day05;
/*
 * 方法定义的格式
 * 修饰符  返回值类型  方法的名字（参数列表）
 * 方法最后一行需要写return
 */
public class MethodDemo {
	public static void main(String[] args) {
		//在mian中调用方法
		int area=getArea(5, 4);
		System.out.println(area);
	}
/*
 * 计算长方形面积
 */
	public static  int  getArea(int a,int b){
		return a*b;	
	}
}
