package com.Spring.DigitalBanking.services;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.stereotype.Service;

@Service
public class BankService {

    private BigDecimal balance = BigDecimal.ZERO;
    private static final BigDecimal HUNDRED = new BigDecimal("100");

    public BigDecimal processTransaction(BigDecimal amount, String type) {
        switch (type) {
            case "credit":
                balance = balance.add(amount);
                break;
            case "debit":
                balance = balance.subtract(amount);
                break;
            case "interest": // Juros compostos para simplificar
                BigDecimal interest = balance.multiply(amount.divide(HUNDRED)).setScale(2, RoundingMode.HALF_EVEN);
                balance = balance.add(interest);
                break;
            default:
                throw new IllegalArgumentException("Tipo de transação inválido.");
        }
        return balance.setScale(2, RoundingMode.HALF_EVEN); 
    }
}