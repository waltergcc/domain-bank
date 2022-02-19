package com.study;

public class Main {

    public static void main(String[] args) {

        Cliente walter = new Cliente();
        walter.setNome("Walter");

        Conta cc = new ContaCorrente(walter);
        Conta poupanca = new ContaPoupanca(walter);

        cc.depositar(1200);
        cc.transferir(500, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
