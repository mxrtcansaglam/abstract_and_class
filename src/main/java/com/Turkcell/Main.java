package com.Turkcell;

import com.Turkcell.DataAccess.CustomerManager;
import com.Turkcell.Entities.Customer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



     Customer sb=new Customer("mer","faa00","1005451",2000,true);
        CustomerManager a=new CustomerManager("mer","faa00","1005451",2000,true);
        a.customerAdd(new Customer("mer","faa00","1005451",2000,false));




    }
}