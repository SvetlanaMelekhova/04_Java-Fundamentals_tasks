package by.htp.less06.main;
/*12. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца*/

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {

		int m;
		int n;
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите количество столбцов:");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		m = sc.nextInt();

		System.out.print("Введите количество строк:");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		n = sc.nextInt();

		int[][] mas = new int[n][m];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (j >= i) {
					mas[i][j] = 1;
				} else {
					mas[i][j] = 0;
				}

				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}

	}

}
