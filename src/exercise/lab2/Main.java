package exercise.lab2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] studentName = {"ȫ�浿", "�ȱ���", "����ĥ", "���̻�", "������", "�̼���", "�������", "�庸��", "�̼���", "�漱��"};
		int[] arr = {30, 23, 25, 19, 22, 21, 27, 26, 22, 24};
		ArrayList<Student> list = new ArrayList<Student>();
		for(int i=0; i<10; i++) {
			list.add(new Student(i+1, studentName[i], arr[i]));
		}
		
		Collections.sort(list);
		for(Student a : list) {
			System.out.println(a.toString());
		}
	}
	
}