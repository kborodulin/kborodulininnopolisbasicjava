package ru.kborodulin.task4;

public class ViewDeposit {
    private String deposit1 = "vklad1";
    private double percent1;
    private String deposit2 = "vklad2";
    private double percent2;

    public ViewDeposit(String deposit) {
        if (deposit1.equals(deposit)) {
            deposit = deposit1;
            percent1 = 3;
        }

        if (deposit2.equals(deposit)) {
            deposit = deposit2;
            percent1 = 4;
        }
    }

    public String getDeposit1() {
        return deposit1;
    }

    public void setDeposit1(String deposit1) {
        this.deposit1 = deposit1;
    }

    public double getPercent1() {
        return percent1;
    }

    public void setPercent1(double percent1) {
        this.percent1 = percent1;
    }

    public String getDeposit2() {
        return deposit2;
    }

    public void setDeposit2(String deposit2) {
        this.deposit2 = deposit2;
    }

    public double getPercent2() {
        return percent2;
    }

    public void setPercent2(double percent2) {
        this.percent2 = percent2;
    }

    public void renameDeposit1(String deposit1, String persent1) {
        this.deposit1 = deposit1;
        this.percent1 = percent1;
    }

    public void renameDeposit2(String deposit2, String persent2) {
        this.deposit2 = deposit2;
        this.percent2 = percent2;
    }
}