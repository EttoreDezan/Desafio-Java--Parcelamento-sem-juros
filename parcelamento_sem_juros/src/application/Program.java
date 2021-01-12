package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int valorDaCompra;
		int qtdParcelas;
		int resto;
		int valorCompraFinal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor da compra: ");
		valorDaCompra = sc.nextInt();
		
		System.out.println("Quantidade de parcelas: ");
		qtdParcelas = sc.nextInt();
		
		System.out.println("\n----- Parcelas à pagar -----\n");
		
		valorCompraFinal =  valorDaCompra / qtdParcelas;
		
		if (valorDaCompra % qtdParcelas != 0) {
			resto = valorDaCompra % qtdParcelas;
			qtdParcelas -= resto;
			
			System.out.printf("%dx de R$%d,00\n", resto, valorCompraFinal + 1);
		}
		
		System.out.printf("%dx de R$%d,00\n", qtdParcelas, valorCompraFinal);
	
		 
		sc.close();	
	 }	
}
