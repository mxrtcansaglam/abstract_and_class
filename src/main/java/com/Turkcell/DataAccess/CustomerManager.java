package com.Turkcell.DataAccess;

import com.Turkcell.Entities.Customer;
import com.Turkcell.Services.CoffeManager;
import com.Turkcell.Services.MernisManager;

public class CustomerManager extends CoffeManager {



    public MernisManager mernisManager;

    public CustomerManager(String firstName, String lastName, String nationalId, int birtDate, boolean ismersis) {
        super(firstName, lastName, nationalId, birtDate, ismersis);
    }


    @Override
    public void customerAdd(Customer customer) {
       // if (customer instanceof MernisManager){
          //  MernisManager mernisManager=(MernisManager) customer;
            if (customer.isIsmersis())
            {
                System.out.println("müşteri kaydedildi");
            }
            else {
                System.out.println("mernis sisteminde bulunamadı");
            }

        //}
      //  else {
          //  System.out.println("müşteri doğrulaması gerekiyor");
       // }

    }




}
