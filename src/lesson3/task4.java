package lesson3;

public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Создаем массив случайных чисел\n");
		int[][] arr = new int[3][4];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 100);
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}

		int max = 0;
		System.out.println();
		System.out.println("Выводим максимальное значение столбцов\n");
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (max < arr[j][i]) {
					max = arr[j][i];
				}
			}
				System.out.println("Максимальный элемент столбца № " + i + " равен " + max);
		}
			System.out.println();


}
	}
