package prog.kiev.ua;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Andrey on 15.02.2016.
 */
@Entity
@Table(name = "currency_rates")
public class CurrencyRate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Currency currency;

    private Date date;

    private float rate;

    public CurrencyRate(){}

    public CurrencyRate(Currency currency, Date date, float rate){
        this.currency = currency;
        this.date = date;
        this.rate = rate;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public long getId() {
        return id;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Date getDate() {
        return date;
    }

    public float getRate() {
        return rate;
    }
}
