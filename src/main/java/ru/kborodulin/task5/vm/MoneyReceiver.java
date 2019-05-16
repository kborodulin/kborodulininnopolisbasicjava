package ru.kborodulin.task5.vm;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.kborodulin.task5.exception.InvalidDrinkNumberException;
import ru.kborodulin.task5.exception.NotMoneyException;

/**
 * Купюроприемник
 */
@Data
public class MoneyReceiver {
    private static final Logger logger = LoggerFactory.getLogger(MoneyReceiver.class);

    public static int inputNumOperation() {
        int numOperation = 0;
        try {
            numOperation = Integer.parseInt(IOVendingMachine.readTerminal());
        } catch (NumberFormatException e) {
            System.out.println("Ввод номера операции, ошибка формата целого числа!!!");
            logger.error("Ввод номера операции, ошибка формата целого числа!!!", e);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Ошибка ввода номера операции!!!", e);
        }
        logger.info("Введен номер операции: {}", numOperation);
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
            logger.error(e.getMessage(), e);
        } catch (NumberFormatException e) {
            System.out.println("Ввод номера напитка, ошибка формата целого числа!!!");
            logger.error("Ввод номера напитка, ошибка формата целого числа!!!", e);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Ошибка ввода номера напитка!!!", e);
        }
        logger.info("Введен номер напитка: {}", numDrink);
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
            logger.error(e.getMessage(), e);
        } catch (NumberFormatException e) {
            System.out.println("Добавление денег, ошибка формата целого/дробного числа!!!");
            logger.error("Добавление денег, ошибка формата целого/дробного числа!!!", e);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Ошибка добавления денег!!!", e);
        }
        logger.info("Введен номер напитка: {}", money);
        return money;
    }
}