package contaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da conta: ");
		int numero = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Por favor, Digite a agência: ");
		String agencia = scanner.nextLine();

		System.out.println("Por favor, Digite seu nome: ");
		String cliente = scanner.nextLine();
		
		System.out.println("Por favor, Digite seu saldo: ");
		double saldo = scanner.nextDouble();
		
		String mensagem = "Olá, " + cliente + 
				", obrigado por criar uma conta no nosso banco, sua agencia é "+ agencia +
				", sua conta é " + numero + ", e seu saldo é R$" + saldo + 
				" já está disponível para saque.";
		
		System.out.println("\n" + mensagem); 
		
		scanner.close();

	}

}
