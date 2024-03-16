package com.Turkcell.Services;

import com.Turkcell.Entities.Customer;

public class Nero extends CoffeManager
{


    public Nero(String firstName, String lastName, String nationalId, int birtDate, boolean ismersis) {
        super(firstName, lastName, nationalId, birtDate, ismersis);
    }

    @Override
    public void customerAdd(Customer customer) {
        System.out.println("müşteri kaydedildi");
    }
}
