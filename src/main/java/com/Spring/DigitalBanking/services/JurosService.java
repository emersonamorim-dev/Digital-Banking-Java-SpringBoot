package com.Spring.DigitalBanking.services;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import org.springframework.stereotype.Service;

@Service
public class JurosService {

    public BigDecimal calculateCompoundInterest(BigDecimal principal, BigDecimal rate, int timesPerYear, int years) {
        BigDecimal onePlusRateByNTimes = BigDecimal.ONE.add(rate.divide(new BigDecimal(timesPerYear), 2, RoundingMode.HALF_EVEN));
        int nTimesT = timesPerYear * years;
        return principal.multiply(onePlusRateByNTimes.pow(nTimesT, MathContext.DECIMAL64)).setScale(2, RoundingMode.HALF_EVEN);
    }
}