package day05;

import java.util.Random;

/*
 * ʵ�ֵ�����
 * 1���洢����
 * 2��Ԥ������ѧ����������������
 * 3�������ӡѧ����
 * �����ܶ������������ɷ��������÷���
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
	 * ���巽�����������ѧ��
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
	 * ��������
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
