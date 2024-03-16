package com.Turkcell.Entities;

public class Customer extends BaseEntity {

public  boolean ismersis;


    public Customer(String firstName, String lastName, String nationalId, int birtDate, boolean ismersis) {
        super(firstName, lastName, nationalId, birtDate);
        this.ismersis = ismersis;
    }

    public boolean isIsmersis() {
        return ismersis;
    }

    public void setIsmersis(boolean ismersis) {
        this.ismersis = ismersis;
    }
}
