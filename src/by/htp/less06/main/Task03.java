package by.htp.less06.main;

/*3. Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево, вторая
строка слева направо, третья строка справа налево и так далее.*/

import java.util.Scanner;
import java.util.Random;

public class Task03 {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		System.out.print("Введите количество строк последовательности:");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		a = sc.nextInt();

		System.out.print("Введите количество столбцов последовательности:");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		b = sc.nextInt();

		int[][] mas = new int[a][b];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rd.nextInt(2000) - 1000;
				System.out.printf("%5d", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < mas.length; i++) {
			if (i % 2 == 0) {
				for (int j = mas[i].length-1; j >= 0; j--) {
					System.out.printf("%5d", mas[i][j]);	
				}
			} else {
				for (int j = 0; j < mas[i].length; j++) {
					System.out.printf("%5d", mas[i][j]);
				}
			}
			System.out.println();
		}
	}

}
