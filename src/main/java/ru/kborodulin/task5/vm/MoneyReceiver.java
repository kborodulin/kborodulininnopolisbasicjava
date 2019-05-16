package ru.kborodulin.task5.vm;

import lombok.Data;
import ru.kborodulin.task5.exception.InvalidDrinkNumberException;
import ru.kborodulin.task5.exception.NotMoneyException;

/**
 * Купюроприемник
 */
@Data
public class MoneyReceiver {
    public static int inputNumOperation() {
        int numOperation = 0;
        try {
            numOperation = Integer.parseInt(IOVendingMachine.readTerminal());
        } catch (NumberFormatException e) {
            System.out.println("Ввод номера операции, ошибка формата целого числа!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return numOperation;
    }

    public static int inputNumDrink() {
        int numOperation = 0;
        try {
            String line = IOVendingMachine.readTerminal();
            if (line.isEmpty()) {
                throw new InvalidDrinkNumberException();
            }
            numOperation = Integer.parseInt(line);
        } catch (InvalidDrinkNumberException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Ввод номера напитка, ошибка формата целого числа!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return numOperation;
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
        } catch (NumberFormatException e) {
            System.out.println("Добавление денег, ошибка формата целого/дробного числа!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return money;
    }
}