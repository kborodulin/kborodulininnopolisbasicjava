package ru.kborodulin.task4;

import java.time.LocalDate;

/**
 * Клиент
 */
public class Client {
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate birthDay;
    private String passport;

    public Client(String lastName, String firstName, String middleName, LocalDate birthDay, String passport) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDay = birthDay;
        this.passport = passport;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public void renameClient(String lastName, String firstName, String middleName, LocalDate birthDay, String passport) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDay = birthDay;
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Client{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", birthDay=" + birthDay +
                ", passport='" + passport + '\'' +
                '}';
    }
}