package lesson3;
// 1. ��� �������� ������� �������� �� �������� ����������� ��.�� ����� �������
import java.util.Random;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x[] = new double[10];
		double max = 0;

		for (int i = 0; i < x.length; i++) {
			Random ran = new Random();
			int s = ran.nextInt(1000);
			x[i] = s;
		}
		for (int i = 0; i < x.length; i++) {
			System.out.println("�������� ������ " + x[i]);
		}

		for (int i = 0; i < x.length; i++) {
			if (x[i] > max) {
				max = x[i];
			}
		}
		System.out.println("������������ ����� = " + max);
		double c = 0;

		for (int i = 0; i < x.length; i++) {
			c = (x[i] / max);
			System.out.println("������� " + c);

		}

	}
}
