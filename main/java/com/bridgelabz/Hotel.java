package com.bridgelabz;

public class Hotel {
    String hotelName;
    double rate=0.0;


    public Hotel(String hotelName,double rate){
        this.hotelName=hotelName;
        this.rate=this.rate;
    }


    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", rating=" + rate +
                '}';
    }
}
