package ru.kborodulin.task1;

public class Benzine {
    public static final int COSTLITERBENS = 43;

    public static void main(String[] args) {
        if (args.length == 0) {
            args = new String[]{"50"};
        }
        Double amountBens = Double.valueOf(args[0]);
        System.out.println(amountBens * COSTLITERBENS + " руб");
    }
}
