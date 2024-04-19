package com.exchange.currencyconverter.services;

import com.exchange.currencyconverter.CurrencyRepository;
import com.exchange.currencyconverter.models.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyService {

    private final CurrencyRepository repository;
    @Autowired
    public CurrencyService(CurrencyRepository repository) {
        this.repository = repository;
    }

    public List<Currency> get() {
        return repository.get();
    }

    public Currency get(int id) {
        return repository.get(id);
    }
}
