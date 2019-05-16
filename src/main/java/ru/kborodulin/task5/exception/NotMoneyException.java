package ru.kborodulin.task5.exception;

public class NotMoneyException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Не внесены деньги!!!";
    }
}