package by.htp.less06.main;
/*11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз.*/

import java.util.Random;

public class Task11 {

	public static void main(String[] args) {

		Random rd = new Random();
		int[][] mas = new int[10][20];
		int n = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = rd.nextInt(16);
				System.out.printf("%5d", mas[i][j]);
			}
			System.out.println();

		}

		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				if (mas[i][j] == 5) {
					n++;
					if (n == 3) {

						System.out.print((i + 1) + " ");

					}
				}

			}
			
			n = 0;
		}
	}

}
