package lesson3;

import java.util.Scanner;

// 3.  Дана матрица ( двумерный массив). Поменять местами две любые ее строки.
public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
int [] [] x = new  int[7] [5];
int i,j,k = 0;

for ( i = 0; i<x.length; i++) {
	for ( j = 0; j<x[i].length; j++) {
		x [i][j] =(int) (Math.random()*100);
	}
	}
	for (i=0; i<x.length; i++) {
	   for (j=0; j<x[i].length; j++) {
		   System.out.println(x[i][j]+"");   
	}
System.out.println(" ");

}
    System.out.println(" ");
	Scanner sc = new Scanner(System.in);
	System.out.println(" Какие строки поменять ? Введите число:");
	int line1 = sc.nextInt();
	System.out.println("Введите число :  ");
	int line2 = sc.nextInt();
	System.out.println("  ");
	
	for (i=0; i<x.length; i++) {
	   for (j=0; j<x[i].length; j++) {
	   x[line1 - 1] [j] = x[line2 - 1] [j];
	}
}

	for (i=0; i<x.length; i++) {
		for (j=0; j<x[i].length; j++) {
			System.out.println(x[i][j] + "  ");
		}
		System.out.println(" ");
	}
	}
}
 