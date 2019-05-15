package ru.kborodulin.task5.vm;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

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

    public void showDrinks(List<Drink> listDrinks) {
        for (Drink drink : listDrinks) {
            ++numUserDrink;
            System.out.println(String.format("%-3s", numUserDrink) + String.format("%-20s", drink.getNamedrink()) + drink.getMomeyDrink());
        }
    }

    public int getNumListOperationReceiver() {
        return  MoneyReceiver.numListOperation();
    }

//
//    public double addMoney() {
//        MoneyReceiver moneyReceiver = new MoneyReceiver();
//        double money = moneyReceiver.addReceiver();
//        return money;
//    }
//



    /*

    //private Drink drink;
    //private double moneyUserDrink;

    public double addMoney() throws Exception {

        System.out.print("Внесите деньги: ");
        String strMoney = reader.readLine();
        if (strMoney.isEmpty())
            throw new Exception("Пользователь не внес деньги");
        moneyUserDrink = Double.parseDouble(strMoney);
        System.out.println("Внесено денег: " + moneyUserDrink);
        return moneyUserDrink;
    }

    public int giveNumDrink() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.print("Выберите номер напитка: ");
            String strNumDrink = reader.readLine();

            if (strNumDrink.isEmpty()) {
                System.out.println("Пользователь не выбрал номер напитка, попробуйте выбрать снова");
                continue;
            }

            numUserDrink = Integer.parseInt(strNumDrink);

            for (Drink giveDrink : getListDrinks()) {
                if (numUserDrink == giveDrink.getNumDrink()) {
                    drink = giveDrink;
                    System.out.println("Выбран напиток: " + drink);
                    System.out.println("-------------------------------------");
                    return numUserDrink;
                }
            }

            System.out.println("Пользователь выбрал несуществующий номер напитка, попробуйте выбрать снова");
        }
    }

    public void giveDrink() throws Exception {
        if (moneyUserDrink > drink.getMomeyDrink()) {
            System.out.println("Напиток выдан: " + drink);
        } else {
            throw new Exception("Пользователь выбрал более дорогой напиток, чем внесено денег");
        }
    }

    public void cashBack() {
        System.out.println("Сдача: " + (moneyUserDrink - drink.getMomeyDrink()));
    }*/
}