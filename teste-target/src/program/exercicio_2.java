package program;

import java.util.Scanner;

public class exercicio_2 {

	static boolean verificaFibonacci(int n) {
		int s1 = (int) Math.sqrt(5 * n * n + 4);
		int s2 = (int) Math.sqrt(5 * n * n - 4);

		if ((s1 * s1 == 5 * n * n + 4) || (s2 * s2 == 5 * n * n - 4))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (verificaFibonacci(n)) {
			System.out.println("É um número Fibonacci");
		} else {
			System.out.println("Não é um número Fibonacci");
		}

	}

}
