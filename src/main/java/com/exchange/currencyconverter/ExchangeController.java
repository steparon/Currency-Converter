package com.exchange.currencyconverter;

import com.exchange.currencyconverter.services.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeController {
    @Autowired
    private ExchangeService exchangeService;
    //TODO: fix this
    @GetMapping("/exchange/{from}/{to}/{amount}")
    public ExchangeService.ExchangeResponse exchange(@PathVariable String from, @PathVariable String to, @PathVariable Double amount) {
        return exchangeService.getExchangeRate(from, to, amount);
    }
}
