package com.Spring.DigitalBanking.controllers;

import com.Spring.DigitalBanking.model.Transaction;
import com.Spring.DigitalBanking.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/bank")
public class BankController {

    @Autowired
    private BankService bankService;

    @PostMapping("/transaction")
    public ResponseEntity<String> postTransaction(@RequestBody Transaction transaction) {
        BigDecimal newBalance = bankService.processTransaction(transaction.getAmount(), transaction.getType());
        return ResponseEntity.ok("Transação bem-sucedida. Novo balanço: " + newBalance);
    }
}