package com.bridgelabz;

public class Hotel {
    String hotelName;
    double numberOfRatings=0.0;
    double averageRating=0.0;

    public Hotel(String hotelName,double rating){
        this.hotelName=hotelName;
        this.numberOfRatings=this.numberOfRatings+1;
        this.averageRating=(this.numberOfRatings*this.averageRating+ rating)/this.numberOfRatings ;

    }
    public void updateRating(double rating){
        this.numberOfRatings=this.numberOfRatings+1;
        this.averageRating=(this.numberOfRatings*this.averageRating+ rating)/this.numberOfRatings ;

    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", rating=" + averageRating +
                '}';
    }
}
