package ru.kborodulin.task4;

import java.util.Objects;

/**
 * Вклад
 */
public class Deposit {
    private String nameDeposit;
    private double percentDeposit;

    public Deposit(String nameDeposit, double percentDeposit) {
        this.nameDeposit = nameDeposit;
        this.percentDeposit = percentDeposit;
    }

    public String getNameDeposit() {
        return nameDeposit;
    }

    public void setNameDeposit(String nameDeposit) {
        this.nameDeposit = nameDeposit;
    }

    public double getPercentDeposit() {
        return percentDeposit;
    }

    public void setPercentDeposit(double percentDeposit) {
        this.percentDeposit = percentDeposit;
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "nameDeposit='" + nameDeposit + '\'' +
                ", percentDeposit=" + percentDeposit +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deposit deposit = (Deposit) o;
        return Double.compare(deposit.percentDeposit, percentDeposit) == 0 &&
                Objects.equals(nameDeposit, deposit.nameDeposit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameDeposit, percentDeposit);
    }
}
