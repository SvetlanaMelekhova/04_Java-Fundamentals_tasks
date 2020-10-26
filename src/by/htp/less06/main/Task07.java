package by.htp.less06.main;

import java.util.Scanner;

public class Task07 {

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

				if (j >= mas[i].length - i) {
					mas[i][j] = 0;
				} else {
					mas[i][j] = i + 1;
				}

				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
	}

}
