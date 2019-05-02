package ru.kborodulin.task6.contract;

import java.time.LocalDate;
import java.util.List;

public class Act {
    private String numAct;
    private LocalDate dateAct;
    private String seller;
    private String customer;
    private List<String> listProducts;

    public Act(Agreement agreement) {
        this.numAct = agreement.getNumAgreement();
        this.dateAct = agreement.getDateAgreement();
        this.seller = agreement.getSeller();
        this.customer = agreement.getCustomer();
        this.listProducts = agreement.getListProducts();
    }

    public String getNumAct() {
        return numAct;
    }

    public void setNumAct(String numAct) {
        this.numAct = numAct;
    }

    public LocalDate getDateAct() {
        return dateAct;
    }

    public void setDateAct(LocalDate dateAct) {
        this.dateAct = dateAct;
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
        return "Act{" +
                "numAct='" + numAct + '\'' +
                ", dateAct=" + dateAct +
                ", seller='" + seller + '\'' +
                ", customer='" + customer + '\'' +
                ", listProducts=" + listProducts +
                '}';
    }
}