package ru.kborodulin.task5.vm;

import java.util.Arrays;

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
        System.out.println("1 - Внести деньги на счет");
        System.out.println("2 - Довнести деньги на счет");
        System.out.println("3 - Получить напиток по его номеру");
        System.out.println("4 - Выдать сдачу");
        System.out.println("5 - Завершить обслуживание");
        System.out.println("\n");

        while (true) {
            System.out.print("Введите номер операции: ");
            if (vm.getNumListOperationReceiver() == 5) {
                System.out.println("Обслуживание завершено!!!");
                break;
            }
        }




        /*
        System.out.print("Внесите деньги: ");
        double money = vm.addMoney();
        System.out.println("На счету денег: " + money);
    */

        // Выберем номер напитка
        // int keyDrink = vm.giveNumDrink();

        // Выдадим напиток
        //vm.giveDrink();

        // Вернем сдачу
        //  vm.cashBack();
    }
}
