package by.htp.less06.main;

import java.util.Scanner;
import java.util.Random;

public class Task09 {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		System.out.print("Введите количество строк последовательности:");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		n = sc.nextInt();

		int[] mas = new int[n];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rd.nextInt(10);
			System.out.print(mas[i] + " ");
		}
		System.out.println();
		System.out.println();
		int[][] mas2 = new int[n][n];
		for (int i = 0; i < mas2.length; i++) {
			for (int j = 0; j < mas2[i].length; j++) {
				if (i == 0) {
					mas2[i][j] = mas[j];
				} else {
					mas2[i][j] = (int) Math.pow(mas[j], i + 1);
				}

				System.out.printf("%8d", mas2[i][j]);
			}
			System.out.println();
		}

	}

}
