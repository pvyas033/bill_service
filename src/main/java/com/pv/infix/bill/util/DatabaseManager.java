package com.pv.infix.bill.util;

import com.pv.infix.bill.bean.Bill;
import com.pv.infix.bill.info.BillCode;

import java.util.*;

public class DatabaseManager{
    
    public DatabaseManager(){
        connect();
        populateData();
    }
    
    private static void connect(){
      // TO-DO connect to data base
    }
    
    private void populateData(){
        this.bills = new ArrayList<>();
        this.billMap = new HashMap<>();
        // TO-DO populate data from database
    }
    
    public void addBill(Bill bill){
        bill.setTotal(TaxCalculator.getTotalAmount(bill.getPrice(), bill.getTax()));
        if(bill.getBilledDate()==null){
            bill.setDueDate(Calendar.getInstance().getTime());
        }
        // TO-DO add bill to database
        
        this.billMap.put(bill.getNumber(),bill);
        this.bills.add(bill);
    }
    
    public List<Bill> getBills(){
        return bills;
    }
    
    public Bill getBillById(Integer id){
        if(billMap.containsKey(id)){
            return billMap.get(id);
        }
        return null;
    }
    
    private List<Bill> bills;
    private Map<Integer, Bill> billMap;
}
