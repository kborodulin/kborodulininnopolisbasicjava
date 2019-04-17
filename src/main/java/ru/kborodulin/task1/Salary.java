package ru.kborodulin.task1;

public class Salary {
    public static void main(String[] args) {
        if (args.length == 0) {
            args = new String[]{"50"};
        }
        Double salaryDirty = Double.valueOf(args[0]);
        Double salaryNet = salaryDirty - (salaryDirty * 0.13);
        System.out.println(salaryNet + " руб");
    }
}
