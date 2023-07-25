package com.careerit.eci.service;

import com.careerit.eci.domain.Currency;

import java.util.Optional;

public interface CurrencyService {
    Optional<Currency> findCurrency(String code);
}
