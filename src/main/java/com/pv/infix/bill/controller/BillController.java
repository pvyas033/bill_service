package com.pv.infix.bill.controller;

import com.pv.infix.bill.bean.Bill;
import com.pv.infix.bill.exception.InvalidRequest;
import com.pv.infix.bill.info.BillCode;
import com.pv.infix.bill.service.BillService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class BillController{
    
    @GetMapping("/bills")
    public List<Bill> bills() throws InvalidRequest{
        return billService.getBills();
    }
    
    @PostMapping("/add")
    public String add(@RequestBody Bill bill) throws InvalidRequest{
        billService.addBill(bill);
        return BillCode.ADD_BILL_SUCCESS;
    }
    
    
    @RequestMapping(value = "/bills/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Bill billById(
            @PathVariable("id") Integer id) throws  InvalidRequest {
        Bill bill= billService.getBillById(id);
        if(bill == null){
            throw new InvalidRequest(BillCode.BILL_ID_NOT_EXIST);
        }
        return bill;
    }
    
    private BillService billService = BillService.getInstance();
}
