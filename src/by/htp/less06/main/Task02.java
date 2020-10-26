package by.htp.less06.main;
//2. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

import java.util.Random;
import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		int k;
		int p;
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
		
		
		System.out.print("Введите номер выбранной строки:");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		k = sc.nextInt();
		
		for (int i = k-1; ; ) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%5d", mas[i][j]);
			}
         break;
		}
		System.out.println();
		System.out.print("Введите номер выбранного столбца:");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		p = sc.nextInt();
		
		for (int i=0;i<mas.length ; i++ ) {
			for (int j = p-1; ; ) {
				System.out.printf("%5d", mas[i][j]);
				break;
			}
         
		}
	}

}
