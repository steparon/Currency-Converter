package com.exchange.currencyconverter.models;

import jakarta.persistence.*;

import java.util.Objects;


@Entity
@Table(name= "currencies")
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "currency_id")
    private int id;

    @Column(name = "currency_name")
    private String name;

    public Currency() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Currency currency = (Currency) o;
        return id == currency.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
