import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, seja bem-vindo!, qual é o seu nome?");
        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.printf("Olá, %s que bom te ver por aqui! Agora nos informe a agência\n", nome);
        System.out.print("Agência: ");
        String agencia = scanner.next();

        System.out.printf("Estamos quase lá, %s precisamos que nos informe também o número da conta\n", nome);
        System.out.print("Conta: ");
        int numeroConta = scanner.nextInt();

        System.out.printf("E pra finalizar %s, informe o saldo\n", nome);
        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque", nome, agencia, numeroConta, saldo);

    }
}