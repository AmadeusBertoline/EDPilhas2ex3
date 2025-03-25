package view;

import controller.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int res, i;
		i = 0;

		Scanner scanner = new Scanner(System.in);
		FatController fat = new FatController();

		while (i != 9) {

			System.out.println("Digite um valor de 0 a 10: ");
			res = scanner.nextInt();

			if (res < 0 || res > 10) {

				System.out.println("O valor excede os limites");

			} else if (res >= 0 && res <= 10) {
				
				System.out.println(fat.Fatorial(res));  

				i = 9;

			}

		}

		

		

	}

}
