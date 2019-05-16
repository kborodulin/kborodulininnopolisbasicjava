package ru.kborodulin.task5.vm;

import ru.kborodulin.task5.exception.NotEnoughMoney;
import ru.kborodulin.task5.exception.NotSelectedDrinkListException;

import java.util.Arrays;

import static java.lang.System.exit;

/**
 * Реализовать программу «Вендинговый автомат», которая позволит:
 * <p>
 * Посмотреть меню напитков
 * Внести деньги на внутренний счет
 * Выбрать номер напитка и получить его, если на счету достаточно средств.
 * <p>
 * Программа должна обрабатывать следующие ситуации:
 * <p>
 * Пользователь не внес деньги
 * Пользователь выбрал более дорогой напиток, чем внесено денег
 * Пользователь выбрал несуществующий номер напитка
 * <p>
 * Для хранения напитков предлагается использовать массив с enum (или с обычным классом). У напитка должна быть цена и название.
 */
public class App {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine(Arrays.asList(Drink.values()));

        System.out.println("----------Меню напитков----------");
        vm.showDrinks(vm.getListDrinks());
        System.out.println("\n");

        System.out.println("----------Список операций--------");
        for (String listOperation : vm.listOperation()) {
            System.out.println(listOperation);
        }
        System.out.println("\n");

        while (true) {
            System.out.print("Введите номер операции: ");
            switch (vm.getNumOperation()) {
                case 1:
                    for (String listOperation : vm.listOperation()) {
                        System.out.println(listOperation);
                    }
                    break;
                case 2:
                case 3:
                    System.out.print("Введите сумму: ");
                    vm.addMoney();
                    if (vm.getMoneyUserDrink() > 0)
                        System.out.println("Количество денег на счету: " + vm.getMoneyUserDrink());
                    break;
                case 4:
                    System.out.println("Остаток на счете: " + vm.getMoneyUserDrink());
                    break;
                case 5:
                    System.out.print("Введите номер напитка: ");
                    int numDrink = 0;
                    String strDrink = "";
                    try {
                        numDrink = vm.getNumDrink();
                        strDrink = vm.giveDrink(numDrink);
                        System.out.println("Выдан: " + strDrink + ", остаток на счете: " + vm.getMoneyUserDrink());
                    } catch (NotSelectedDrinkListException e) {
                        System.out.println(e.getMessage());
                    } catch (NotEnoughMoney e) {
                        System.out.println(e.getMessage());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:
                case 7:
                    System.out.println("Вылана сдача: " + vm.getMoneyUserDrink());
                    System.out.println("Обслуживание завершено");
                    exit(0);
                default:
                    System.out.println("Выбран несуществуюший тип операции!!!");
                    break;
            }
        }
    }
}