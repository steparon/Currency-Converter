package com.exchange.currencyconverter;

import com.exchange.currencyconverter.models.Currency;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CurrencyRepository {

    private final SessionFactory sessionFactory;

    @Autowired
    public CurrencyRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Currency> get() {
        try (Session session = sessionFactory.openSession()) {
            Query<Currency> query = session.createQuery("from Currency", Currency.class);
            return query.list();
        }
    }

    public Currency get(int id) {
        try (Session session = sessionFactory.openSession()) {
            Currency currency = session.get(Currency.class, id);
            return currency;
        }
    }

}
