package br.com.f3dev.runner;

import br.com.f3dev.conta.ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ContaBanco cont1 = new ContaBanco();

        System.out.println("Seja bem Vindo ao banco F3Inovation!");

        System.out.println("Por favor, digite o número da Sua Conta! ");
        cont1.numero = scanner.nextInt();

        System.out.println("Digite o número da Agência! ");
        cont1.agencia = scanner.next();

        System.out.println("Agora digite o nome do Cliente! ");
        cont1.nomeCliente = scanner.next();

        System.out.println("E agora digite o seu Saldo! ");
        cont1.saldo = scanner.nextDouble();

        String saida = String.format("Olá %s, Obrigado por criar uma conta em nosso banco! Sua agência é %s," +
                        " o número de sua conta é:%d e seu saldo atual é de:R$ %s.Já disponível para saque!",
                cont1.nomeCliente, cont1.agencia, cont1.numero, cont1.saldo);

        System.out.println(saida);



    }
}
