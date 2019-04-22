package ru.kborodulin.task4;

/**
 * Клиент - Вклад
 */

public class ClientDeposit {
    private Client client;
    private Deposit deposit;
    private double sumDeposit;

    public ClientDeposit(Client client, Deposit deposit, double sumDeposit) {
        this.client = client;
        this.deposit = deposit;
        this.sumDeposit = deposit.getPercentDeposit() * sumDeposit;
        System.out.print("Вклад открыт на сумму: " + this.sumDeposit + " ");
    }

    public void clientDepositClose(ClientDeposit clientDeposit) {
        System.out.print("Вклад закрыт: " + clientDeposit.client + clientDeposit.deposit);
    }

    @Override
    public String toString() {
        return "ClientDeposit{" +
                "client=" + client +
                ", deposit=" + deposit +
                '}';
    }
}
