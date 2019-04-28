package ru.kborodulin.task5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class VendingMachine {
    private List<Drink> listDrinks;
    private Drink drink;
    private double moneyUserDrink;
    private int numUserDrink;

    public VendingMachine(List<Drink> listDrinks) {
        this.listDrinks = listDrinks;
    }

    public List<Drink> getListDrinks() {
        return listDrinks;
    }

    public void setListDrinks(List<Drink> listDrinks) {
        this.listDrinks = listDrinks;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public double getMoneyUserDrink() {
        return moneyUserDrink;
    }

    public void setMoneyUserDrink(double moneyUserDrink) {
        this.moneyUserDrink = moneyUserDrink;
    }

    public int getNumUserDrink() {
        return numUserDrink;
    }

    public void setNumUserDrink(int numUserDrink) {
        this.numUserDrink = numUserDrink;
    }

    public void showDrinks(List<Drink> listDrinks) {
        for (Drink menu : getListDrinks()) {
            System.out.println(String.format("%-3s", menu.getNumDrink()) + String.format("%-20s", menu.getNameDrink()) + menu.getMomeyDrink());
        }
        System.out.println("-------------------------------------");
    }

    public double addMoney() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Внесите деньги: ");
        String strMoney = reader.readLine();
        if (strMoney.isEmpty())
            throw new Exception("Пользователь не внес деньги");
        moneyUserDrink = Double.parseDouble(strMoney);
        System.out.println("Внесено денег: " + moneyUserDrink);
        System.out.println("-------------------------------------");
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
    }
}