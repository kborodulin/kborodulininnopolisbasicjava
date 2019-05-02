package ru.kborodulin.task6.contract;

public class AgreementAct {

    public static Act convert(Agreement agreement) {
        Act act = new Act(agreement);
        return act;
    }
}