package lesson3;

import java.util.Random;

public class task2 {
	// 2. ��� ������ � ������������� ����, ���������� 20 ������������� �
	// ������������� ���������
	// ������������ ������ � �� ������������� ��������� ������� �, ������� ������
	// ������.
	// ����� ����� ��������� ��������� ������ �����
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] a = new double[20];
		int j = -1;
		for (int i = 0; i < a.length; i++) {
			a[i] = (double) Math.round((Math.random() * 200) - 100);
			System.out.println("������ � " + a[i]);
		}
		double[] b = new double[20];
		for (int i = 0; i < a.length; i = i + 2) {
			if (a[i] > 0) {
				j++;
				b[j] = a[i];
			}
 
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println("������ � " + b[i]);
		}
		double sum = 0;
		for (int i = 0; i < b.length; i++) {
			sum = sum + b[i] * b[i];
		}
		for (int i = 0; i < b.length; i++) {
			
		}		System.out.println("����� ��������� =" + sum);
	}

}
