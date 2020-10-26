package by.htp.less06.main;

//10. Найти положительные элементы главной диагонали квадратной матрицы.
import java.util.Random;
import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		System.out.print("Введите количество строк последовательности:");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		n = sc.nextInt();

		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {

				mas[i][j] = rd.nextInt(2000) - 1000;
				System.out.printf("%5d", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < mas.length; i++) {

			if (mas[i][i] > 0) {

				System.out.printf("%5d", mas[i][i]);
			}

		}

	}

}
