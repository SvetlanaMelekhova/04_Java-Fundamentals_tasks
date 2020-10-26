package by.htp.less06.main;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите длину матрицы:");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		n = sc.nextInt();

		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				if (i == 0 || i == n - 1) {

					mas[i][j] = 1;

				} else if (j == 0 || j == n - 1) {

					mas[i][j] = 1;
				}

				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}

	}

}
