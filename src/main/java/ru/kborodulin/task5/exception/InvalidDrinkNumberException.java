package ru.kborodulin.task5.exception;

public class InvalidDrinkNumberException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Не выбран напиток!!!";
    }
}