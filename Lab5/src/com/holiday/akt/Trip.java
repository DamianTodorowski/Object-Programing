package com.holiday.akt;

 class Trip {
     private double price;

     public Trip(double price) {
         this.price = (price <= 100) ? 100 : (price >= 200) ? 200 : price;
     }

     public double getPrice() {
         return price;
     }


     public void setPrice(double price) {
         this.price = price;
     }
 }


