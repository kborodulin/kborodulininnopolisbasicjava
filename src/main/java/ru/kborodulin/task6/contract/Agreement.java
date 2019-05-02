package ru.kborodulin.task6.contract;

import java.time.LocalDate;
import java.util.List;

public class Agreement {
    private String numAgreement;
    private LocalDate dateAgreement;
    private String seller;
    private String customer;
    private List<String> listProducts;

    public Agreement(String numAgreement, LocalDate dateAgreement, String seller, String customer, List<String> listProducts) {
        this.numAgreement = numAgreement;
        this.dateAgreement = dateAgreement;
        this.seller = seller;
        this.customer = customer;
        this.listProducts = listProducts;
    }

    public String getNumAgreement() {
        return numAgreement;
    }

    public void setNumAgreement(String numAgreement) {
        this.numAgreement = numAgreement;
    }

    public LocalDate getDateAgreement() {
        return dateAgreement;
    }

    public void setDateAgreement(LocalDate dateAgreement) {
        this.dateAgreement = dateAgreement;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public List<String> getListProducts() {
        return listProducts;
    }

    public void setListProducts(List<String> listProducts) {
        this.listProducts = listProducts;
    }

    @Override
    public String toString() {
        return "Agreement{" +
                "numAgreement='" + numAgreement + '\'' +
                ", dateAgreement=" + dateAgreement +
                ", seller='" + seller + '\'' +
                ", customer='" + customer + '\'' +
                ", listProducts=" + listProducts +
                '}';
    }
}