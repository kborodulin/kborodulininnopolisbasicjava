package ru.kborodulin.task5.vm;

import lombok.extern.slf4j.Slf4j;
import ru.kborodulin.task5.exception.InvalidDrinkNumberException;
import ru.kborodulin.task5.exception.NotMoneyException;

/**
 * Купюроприемник
 */
@Slf4j
public class MoneyReceiver {
    public static int inputNumOperation() {
        int numOperation = 0;
        try {
            numOperation = Integer.parseInt(IOVendingMachine.readTerminal());
        } catch (NumberFormatException e) {
            System.out.println("Ввод номера операции, ошибка формата целого числа!!!");
            log.error("Ввод номера операции, ошибка формата целого числа!!!", e);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Ошибка ввода номера операции!!!", e);
        }
        log.info("Введен номер операции: {}", numOperation);
        return numOperation;
    }

    public static int inputNumDrink() {
        int numDrink = 0;
        try {
            String line = IOVendingMachine.readTerminal();
            if (line.isEmpty()) {
                throw new InvalidDrinkNumberException();
            }
            numDrink = Integer.parseInt(line);
        } catch (InvalidDrinkNumberException e) {
            System.out.println(e.getMessage());
            log.error(e.getMessage(), e);
        } catch (NumberFormatException e) {
            System.out.println("Ввод номера напитка, ошибка формата целого числа!!!");
            log.error("Ввод номера напитка, ошибка формата целого числа!!!", e);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Ошибка ввода номера напитка!!!", e);
        }
        log.info("Введен номер напитка: {}", numDrink);
        return numDrink;
    }

    public static double addMoney() {
        double money = 0d;
        try {
            String line = IOVendingMachine.readTerminal();
            if (line.isEmpty()) {
                throw new NotMoneyException();
            }
            money = Double.parseDouble(line);
        } catch (NotMoneyException e) {
            System.out.println(e.getMessage());
            log.error(e.getMessage(), e);
        } catch (NumberFormatException e) {
            System.out.println("Добавление денег, ошибка формата целого/дробного числа!!!");
            log.error("Добавление денег, ошибка формата целого/дробного числа!!!", e);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Ошибка добавления денег!!!", e);
        }
        log.info("Введен номер напитка: {}", money);
        return money;
    }
}