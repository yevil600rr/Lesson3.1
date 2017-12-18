package lesson3;

public class tasrrrr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Создаём массив случайных чисел\n");
		int[][] mas = new int[6][4];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) (Math.random() * 9 - 1);
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();

		}
		int min = mas[0][0];
		int max = mas[0][0];
		int sum = 0;
		System.out.println();
		System.out.print("Выводим макс.мин эл-ты столбцов и сумму всех элементов\n");
		for (int i = 0; i < mas[0].length; i++) {
			for (int j = 0; j < mas.length; j++) {
				if (min > mas[j][i]) {
					min = mas[j][i];
				}
				if (max < mas[j][i]) {
					max = mas[j][i];
				}
				sum += mas[j][i];
			}

			System.out.print("Сумма столбца № " + i + " составляет " + sum + " \n");
			System.out.print("Максимальный элемент " + max + " \nМинимальный элемент " + min + " \n\n");

			max = min = sum = 0;
		}
		System.out.println();
		System.out.print("Выводим макс.мин эл-ты строк и сумму всех элементов\n");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[0].length; j++) {
				if (min > mas[i][j]) {
					min = mas[i][j];
				}
				if (max < mas[i][j]) {
					max = mas[i][j];
				}
				sum += mas[i][j];
			}

			System.out.print("Сумма строки № " + i + " " + sum + "\n ");
			System.out.print("Наибольшее число строки " + i + " " + max + " \n");
			System.out.print("Наименьшее число строки " + i + " " + min + " \n\n");
			max = min = sum = 0;
		}
		System.out.println();
		System.out.print("Выводим наибольший и наименьший элемент всего массива\n");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (max < mas[i][j]) {
					max = mas[i][j];
				}
				if (min > mas[i][j]) {
					max = mas[i][j];
				}
			}
		}
		System.out.print("Наименьший элемент массива " + min + " \n");
		System.out.print("Наибольший элемент массива " + max);

		System.out.println();
		System.out.println("Сортировка по столбцам по возрастанию");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				for (int m = 0; m < mas[i].length; m++) {
					if (mas[i][m] < mas[j][m]) {
						int mt = mas[i][m];
						mas[i][m] = mas[j][m];
						mas[j][m] = mt;
					}
				}
			}
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Сортировка всего массива по строкам по убыванию");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				for (int s = 0; s < mas[i].length; s++) {
					for (int z = mas[i].length - 1; z > s; z--) {
						if (mas[i][s] < mas[i][z]) {
							int mt = mas[i][s];
							mas[i][s] = mas[i][z];
							mas[i][z] = mt;
						}
					}
				}
			}
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
	}

}