package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		CriaConta c1 = new CriaConta();
		
		System.out.println("Digite seu nome: ");
		c1.setNomeCliente(sc1.nextLine());
		
		System.out.println("Digite o numero da sua conta: ");
		c1.setNumero(sc1.nextInt());
		
		System.out.println("Digite o numero da sua agencia: ");
		c1.setAgencia(sc1.next());
		
		System.out.println("Digite o valor que deseja depositar: ");
		c1.setSaldo(sc1.nextFloat());
		
		System.out.println("Olá " +c1.getNomeCliente()+ ", obrigado por criar uma conta em nosso banco, sua agência é " +c1.getAgencia()+ ", conta " +c1.getNumero()+ " e seu saldo " +c1.getSaldo()+ " já está disponível para saque.");
	}

}
