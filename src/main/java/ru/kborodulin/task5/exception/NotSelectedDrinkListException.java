package ru.kborodulin.task5.exception;

public class NotSelectedDrinkListException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Неверно выбран напиток, выберите из списка меню напитков!!!";
    }
}