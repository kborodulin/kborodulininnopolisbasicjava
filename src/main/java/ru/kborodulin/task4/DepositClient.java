package ru.kborodulin.task4;

public class DepositClient {
    public DepositClient(Client client, ViewDeposit viewDeposit) {
        System.out.println("Вклад открыт: " + client.toString() + "; " + viewDeposit.getDeposit1() + "; " + viewDeposit.getPercent1());
    }

    public void deleteDepositClient(Client client, ViewDeposit viewDeposit) {
        System.out.println("Вклад закрыт" + client.toString() + "; " + viewDeposit.getDeposit1() + "; " + viewDeposit.getPercent1());
    }
}