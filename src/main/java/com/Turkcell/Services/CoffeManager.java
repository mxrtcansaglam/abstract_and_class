package com.Turkcell.Services;

import com.Turkcell.Entities.Customer;

public abstract class CoffeManager extends Customer  {


    public CoffeManager(String firstName, String lastName, String nationalId, int birtDate, boolean ismersis) {
        super(firstName, lastName, nationalId, birtDate, ismersis);
    }

    public  abstract void customerAdd(Customer customer);

}
