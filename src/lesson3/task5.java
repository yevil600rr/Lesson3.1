package lesson3;
//� ��������� ������� ����� ����� ����������, ������� ��� � ��� 
//����������� ������� �� ��������� X.
import java.util.Scanner;
public class task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("������� ������ ��������� �����\n");
		int[][] arr = new int[3][4];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 10);
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println(" � ����� ������ ������ ���������� ? ������� �����:");
		int pov = sc.nextInt();
		System.out.println("  ");
		int cht = 0;	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if ( pov == arr[i][j]);{
				cht = cht+1;
				}
			}
			System.out.println("���������� ���������� � ������ " +pov+ " = " +cht);
	}
		
	}
}
