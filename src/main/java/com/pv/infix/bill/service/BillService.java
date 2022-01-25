package com.pv.infix.bill.service;

import com.pv.infix.bill.bean.Bill;
import com.pv.infix.bill.util.DatabaseManager;

import java.util.List;

public class BillService{
    
    private BillService(){
        dbManager = new DatabaseManager();
    }
    
    public static BillService getInstance(){
        return billService;
    }
    
    public List<Bill> getBills(){
        return dbManager.getBills();
    }
    
    public void addBill(Bill bill){
        dbManager.addBill(bill);
    }
    
    public Bill getBillById(Integer id){
        return dbManager.getBillById(id);
    }
    
    static {
        billService = new BillService();
    }
    
    private static final BillService billService;
    private final DatabaseManager dbManager;
}
