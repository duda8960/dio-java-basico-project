import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número da sua conta: ");
        int numero = scan.nextInt();
        System.out.println("Digite sua Agência: ");
        String agencia = scan.next();
        System.out.println("Digite seu nome: ");
        String nomeCliente = scan.next();
        System.out.println("Digite seu saldo: ");
        float saldo = scan.nextFloat();

        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua Agência: "+ agencia);
        System.out.println("Conta: "+numero);
        System.out.println("Saldo: "+ saldo);
        System.out.println("Já está disponível para saque!");

    }
}
