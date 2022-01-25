package com.pv.infix.bill.util;

public class TaxCalculator{
    
    public static Double getTotalAmount(Double price, Double tax){
        Double total = price + (price * (tax/100.0d));
        return total;
    }
}
