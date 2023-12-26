package com.company;

import java.util.List;
import java.util.Map;

class CarOne{

    CarOne(String companyName, String model, int year){
        this.CompanyName = companyName;
        this.Model = model;
        this.Year = year;
    }

    public String CompanyName;
    public String Model;
    public int Year;


    public Map<String, Integer> getTotalCarsByCompanyName(List<CarOne> carOneList){

        return null;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }
}

class CarTwo {

    public static void main(String[] arg){
        System.out.println("Car Two");


    }
}

