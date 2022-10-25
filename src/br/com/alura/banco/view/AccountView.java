package br.com.alura.banco.view;

import br.com.alura.banco.Account;

public class AccountView {
    public static void main(String[] args) {
        Account conta1 = new Account(2000.00, 1, 1111, "Eder Sena");
        System.out.println(conta1.toString());

    }
}
