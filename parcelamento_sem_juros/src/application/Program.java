package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int valorDaCompra;
		int qtdParcelas;
		int resto;
		int valorCompraFinal;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Informe o valor da compra: ");
			valorDaCompra = sc.nextInt();

			if (valorDaCompra < 10) {
				System.out.println("Informe um valor maior!");
			} else if (valorDaCompra > 1000) {
				System.out.println("Informe um valor menor!");
			}
		} while (valorDaCompra < 10 || valorDaCompra > 1000);

		do {
			System.out.println("Quantidade de parcelas: ");
			qtdParcelas = sc.nextInt();

			if (qtdParcelas < 2) {
				System.out.println("Informe maior!");
			} else if (qtdParcelas > 18) {
				System.out.println("Informe um valor menor!");
			}
		} while (qtdParcelas < 2 || qtdParcelas > 18);

		System.out.println("\n----- Parcelas à pagar -----\n");

		valorCompraFinal = valorDaCompra / qtdParcelas;

		if (valorDaCompra % qtdParcelas != 0) { // Se houver sobra na divisao, a mesma sera distribuida em 1 para X  parcelas iniciais(qtdParcelas -= resto).
												
			resto = valorDaCompra % qtdParcelas;
			qtdParcelas -= resto;

			for (int i = 0; i < resto; i++) {
				System.out.println(valorCompraFinal + 1);
			}
		}

		for (int i = 0; i < qtdParcelas; i++) {
			System.out.println(valorCompraFinal);
		}

		sc.close();
	}
}
