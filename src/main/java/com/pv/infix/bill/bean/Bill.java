package com.pv.infix.bill.bean;

import java.util.Date;

public class Bill{
    
    private Integer number;
    private String billedTo;
    private Date billedDate;
    private Double price;
    private Double tax;
    private Double total;
    private Date dueDate;
    
    public Bill(Integer number, String billedTo, Date billedDate, Double price, Double tax){
        this.number = number;
        this.billedTo = billedTo;
        this.billedDate = billedDate;
        this.price = price;
        this.tax = tax;
    }
    
    public Integer getNumber(){
        return number;
    }
    
    public void setNumber(Integer number){
        this.number = number;
    }
    
    public String getBilledTo(){
        return billedTo;
    }
    
    public Date getDueDate(){
        return dueDate;
    }
    
    public void setDueDate(Date dueDate){
        this.dueDate = dueDate;
    }
    
    public void setBilledTo(String billedTo){
        this.billedTo = billedTo;
    }
    
    public Date getBilledDate(){
        return billedDate;
    }
    
    public void setBilledDate(Date billedDate){
        this.billedDate = billedDate;
    }
    
    public Double getPrice(){
        return price;
    }
    
    public void setPrice(Double price){
        this.price = price;
    }
    
    public Double getTax(){
        return tax;
    }
    
    public void setTax(Double tax){
        this.tax = tax;
    }
    
    public Double getTotal(){
        return total;
    }
    
    public void setTotal(Double total){
        this.total = total;
    }
    
    @Override
    public String toString(){
        return "Bill{"+
                "number="+number+
                ", billedTo='"+billedTo+'\''+
                ", billedDate="+billedDate+
                ", price="+price+
                ", tax="+tax+
                ", total="+total+
                '}';
    }
}
