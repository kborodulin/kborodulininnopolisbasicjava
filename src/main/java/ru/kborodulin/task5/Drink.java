package ru.kborodulin.task5;

public enum Drink {
    BLACKTEA(1, "Черный чай", 50),
    GREENTEA(2, "Зеленый чай", 45),
    COFFEE(3, "Кофе", 100),
    COCACOLA(4, "Кола", 70),
    FANTA(5, "Фанта", 70),
    SPRITE(6, "Спрайт", 70),
    APPLEJUICE(7, "Яблочный сок", 80),
    ORANGEJUICE(8, "Апельсиновый сок", 80);

    private int numDrink;
    private String nameDrink;
    private double momeyDrink;

    Drink(int numDrink, String nameDrink, double momeyDrink) {
        this.numDrink = numDrink;
        this.nameDrink = nameDrink;
        this.momeyDrink = momeyDrink;
    }

    public int getNumDrink() {
        return numDrink;
    }

    public String getNameDrink() {
        return nameDrink;
    }

    public double getMomeyDrink() {
        return momeyDrink;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "numDrink=" + numDrink +
                ", nameDrink='" + nameDrink + '\'' +
                ", momeyDrink=" + momeyDrink +
                '}';
    }
}