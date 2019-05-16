package ru.kborodulin.task5.exception;

public class NotEnoughMoney extends RuntimeException {
    @Override
    public String getMessage() {
        return "Недостаточно денег, пополните баланс!!!";
    }
}
