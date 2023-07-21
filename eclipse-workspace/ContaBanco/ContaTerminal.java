import java.util.Scanner;
public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroAgencia;
		String nomeAgencia;
		String nomeCliente;
		double saldo;
		
		System.out.println("Por favor, digite o nome do cliente: ");
		nomeCliente = sc.nextLine();
		System.out.println("Por favor, digite nome da agência:");
		nomeAgencia = sc.nextLine();
		System.out.println("Por favor, digite o número da conta: ");
		numeroAgencia = sc.nextInt();
		System.out.println("Por favor, digite o saldo: ");
		saldo = sc.nextDouble();
		sc.close();
		System.out.println(String.format("Olá %s, obrigado por criar uma conta nesse banco. Sua agencia é %s, "
				+ "conta %d e seu saldo R$ %.2f já está pronto para saque.", nomeCliente, nomeAgencia, numeroAgencia, saldo));

	}

}
