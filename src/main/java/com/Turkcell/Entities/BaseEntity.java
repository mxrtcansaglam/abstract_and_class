package com.Turkcell.Entities;

public class BaseEntity <t> {
    private t id;
    private String firstName;
    private String lastName;
    private String nationalId;
    private int birtDate;

    public BaseEntity(String firstName, String lastName, String nationalId, int birtDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalId = nationalId;
        this.birtDate = birtDate;
    }


    public t getId() {
        return id;
    }

    public void setId(t id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public int getBirtDate() {
        return birtDate;
    }

    public void setint(int birtDate) {
        this.birtDate = birtDate;
    }
}
