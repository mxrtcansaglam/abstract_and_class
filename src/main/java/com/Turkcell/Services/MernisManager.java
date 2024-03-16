package com.Turkcell.Services;

import com.Turkcell.Entities.BaseEntity;
import com.Turkcell.Entities.Customer;

public class MernisManager extends Customer {


    public MernisManager(String firstName, String lastName, String nationalId, int birtDate, boolean ismersis) {
        super(firstName, lastName, nationalId, birtDate, ismersis);
    }

    public  boolean mernisDogrula(boolean is){
      return true;
    }

}
