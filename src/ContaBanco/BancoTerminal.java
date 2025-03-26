package ContaBanco;

import java.util.Scanner;

public class BancoTerminal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Banco contaTeste = new Banco();

        System.out.println("Por favor, digite o número da Conta, Agência, seu Nome e Saldo Bancário!");

        contaTeste.setNumero(entrada.nextInt());
        entrada.nextLine();

        contaTeste.setAgencia(entrada.nextLine());
        contaTeste.setNomeCliente(entrada.nextLine());
        contaTeste.setSaldo(entrada.nextDouble());

        System.out.printf(
            "Olá %s, obrigado por criar uma conta em nosso banco! Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n",
            contaTeste.getNomeCliente(),
            contaTeste.getAgencia(),
            contaTeste.getNumero(),
            contaTeste.getSaldo()
        );

        entrada.close();
    }
}
