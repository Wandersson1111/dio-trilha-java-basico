import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        sc.useLocale(Locale.US);

	        // Declaração das variáveis
	        int numero;
	        String agencia; 
	        String nomeCliente;
	        double saldo;

	        // Solicitação do número da conta
	        System.out.print("Por favor, digite o número da Conta: ");
	        numero = sc.nextInt();
	        sc.nextLine();

	        // Solicitação da agência
	        System.out.print("Por favor, digite o número da Agência: ");
	        agencia = sc.nextLine();

	        // Solicitação do nome do cliente
	        System.out.print("Por favor, digite o nome do Cliente: ");
	        nomeCliente = sc.nextLine();

	        // Solicitação do saldo da conta
	        System.out.print("Por favor, digite o saldo da Conta: ");
	        saldo = sc.nextDouble();
	        sc.nextLine();

	        // Exibição das informações da conta
	        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
	                + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

	        sc.close();
	    }
	
}
