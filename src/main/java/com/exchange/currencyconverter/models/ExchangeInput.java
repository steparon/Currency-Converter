package com.exchange.currencyconverter.models;

import jakarta.persistence.*;

@Entity
//@Table(name= "exchanges")
public class ExchangeInput {

  //  @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
  //  @Column(name = "exchange_id")
   // private int id;

   // @Column(name = "from_currency_id")
    private Currency from;

    //@Column(name = "to_currency_id")
    private Currency to;

    private Double amount;

    public ExchangeInput() {
    }


    public Currency getFrom() {
        return from;
    }

    public void setFrom(Currency from) {
        this.from = from;
    }

    public Currency getTo() {
        return to;
    }

    public void setTo(Currency to) {
        this.to = to;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
