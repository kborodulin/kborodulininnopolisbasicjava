package ru.kborodulin.task5.vm;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.kborodulin.task5.exception.NotEnoughMoney;
import ru.kborodulin.task5.exception.NotSelectedDrinkListException;

import java.util.ArrayList;
import java.util.List;

/**
 * Вендинг машина
 */
@Data
@RequiredArgsConstructor
public class VendingMachine {
    @NonNull
    private List<Drink> listDrinks;
    private int numUserDrink;
    private double moneyUserDrink;
    private Drink drink;

    private static final Logger logger = LoggerFactory.getLogger(VendingMachine.class);

    public final List<String> listOperation() {
        List<String> listOperation = new ArrayList();
        listOperation.add("1 - Повторно вывести список операций");
        listOperation.add("2 - Внести деньги на счет");
        listOperation.add("3 - Довнести деньги на счет");
        listOperation.add("4 - Остаток денег на счет");
        listOperation.add("5 - Получить напиток по его номеру");
        listOperation.add("6 - Выдать сдачу и завершить обслуживание");
        listOperation.add("7 - Завершить обслуживание");
        return listOperation;
    }

    public void showDrinks(List<Drink> listDrinks) {
        for (Drink drink : listDrinks) {
            ++numUserDrink;
            System.out.println(String.format("%-3s", numUserDrink) + String.format("%-20s", drink.getNamedrink()) + drink.getMomeyDrink());
        }
    }

    public int getNumOperation() {
        int numOperation = MoneyReceiver.inputNumOperation();
        logger.info("Получен номер операции от клиента: {}", numOperation);
        return numOperation;
    }

    public int getNumDrink() {
        int numDrink = MoneyReceiver.inputNumDrink();
        if (numDrink > listDrinks.size() || numDrink <= 0) {
            throw new NotSelectedDrinkListException();
        }
        logger.info("Получен номер напитка от клиента: {}", numDrink);
        return numDrink;
    }

    public double addMoney() {
        moneyUserDrink += MoneyReceiver.addMoney();
        logger.info("Текущий остаток денег клиента: {}", moneyUserDrink);
        return moneyUserDrink;
    }

    public String giveDrink(int numDrink) {
        drink = listDrinks.get(numDrink - 1);
        if (moneyUserDrink < drink.getMomeyDrink()) {
            throw new NotEnoughMoney();
        }
        moneyUserDrink -= drink.getMomeyDrink();
        String nameDrink = drink.getNamedrink();
        logger.info("Клиенту выдан напиток: {}", nameDrink);
        return nameDrink;
    }
}