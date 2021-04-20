package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class Reservation {
    List<Hotel> hotelList=new ArrayList<>();

   /* Description: this method is used to add Hotel Details to the List of Hotels
   @param hotelName takes hotel'sname
   @param rating takes hotel's ratings
   @return boolean value true if added else false
   */
    public boolean addHotel(String hotelName, double rating){
        Hotel hotel=new Hotel(hotelName,rating);
        hotelList.add(hotel);
        System.out.println("no of ratings" +hotel.numberOfRatings);
        return !hotelList.isEmpty();

    }

    /*Description: This method is used to display the welcome message
    */
    public void message(){
        System.out.println("welcome to Hotel Reservation");
    }
}
