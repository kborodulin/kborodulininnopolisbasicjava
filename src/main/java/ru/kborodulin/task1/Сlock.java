package ru.kborodulin.task1;

public class Сlock {
    public static void main(String[] args) {
        if (args.length == 0) {
            args = new String[]{"3600"};
        }
        Double second = Double.valueOf(args[0]);
        Double hour = second / 60 / 60;
        System.out.println(Math.round(hour) + " час");
    }
}
