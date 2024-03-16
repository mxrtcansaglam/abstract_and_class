package com.Turkcell.Services;

import com.Turkcell.Entities.Customer;

public  class starbucks extends CoffeManager
{


    public starbucks(String firstName, String lastName, String nationalId, int birtDate, boolean ismersis) {
        super(firstName, lastName, nationalId, birtDate, ismersis);
    }

    @Override
    public void customerAdd(Customer customer) {

    }
    private  int yildizSayisi=0;

    public int getYildizSayisi() {
        return yildizSayisi;
    }

    public void setYildizSayisi(int yildizSayisi) {
        this.yildizSayisi = yildizSayisi;
    }




}
