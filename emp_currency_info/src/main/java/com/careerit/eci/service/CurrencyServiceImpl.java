package com.careerit.eci.service;

import com.careerit.eci.domain.Currency;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CurrencyServiceImpl implements  CurrencyService{

    private Map<String,Currency> map;

    public CurrencyServiceImpl(){
        this.map = new HashMap<>();
        // Write code here to load the data from currency_info.csv file and store it in map
    }

    @Override
    public Optional<Currency> findCurrency(String code) {
        return Optional.empty();
    }
}
