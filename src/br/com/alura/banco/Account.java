package br.com.alura.banco;

public class Account {
    private double balance;
    private int agency;
    private int account_number;
    private String owner;

    public Account (double balance, int agency, int account_number, String owner) {
        this.balance = balance;
        this.agency = agency;
        this.account_number = account_number;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", agency=" + agency +
                ", account_number=" + account_number +
                ", owner='" + owner + '\'' +
                '}';
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

}