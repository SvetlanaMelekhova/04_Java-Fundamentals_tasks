package by.htp.less06.main;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		int n;

		Scanner sc = new Scanner(System.in);

		System.out.print("Введите количество строк последовательности:");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		n = sc.nextInt();

		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < mas[i].length; j++) {
					mas[i][j] = j + 1;
					System.out.print(mas[i][j] + " ");
				}

			} else {
				for (int j = mas[i].length-1; j>=0; j--) {
					mas[i][j] = j+1;
					System.out.print(mas[i][j] + " ");
				}

			}
			System.out.println();
		}

	}
}
