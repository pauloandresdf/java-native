import java.util.Scanner;

public class ContaTerminal {
    
    	int numero; 
        String agencia;
        String nomeCliente;
        float saldo;

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaTerminal conta = new ContaTerminal();

        System.out.println("Digite o número da conta: ");
        conta.numero = scanner.nextInt(); 
        scanner.nextLine();
        
        System.out.println("Digite a agência:");
        conta.agencia = scanner.nextLine();

        System.out.println("Digite o nome do cliente:");
        conta.nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo:");
        conta.saldo = scanner.nextFloat();
    
        scanner.close();

        System.out.println("Olá" + conta.nomeCliente);   
        System.out.println("Obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia + ", conta " + conta.numero + " e seu saldo de R$ " + conta.saldo + " já está disponível para saque.");

    }
}
