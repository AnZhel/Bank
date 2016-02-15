package prog.kiev.ua;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Andrey on 15.02.2016.
 */

@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String account;

    private Currency currency;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    private double amount;

    public Account(){}

    public Account(String account, Currency currency, User user,  double amount){
        this.account = account;
        this.currency = currency;
        this.user = user;
        this.amount = amount;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }

    public long getId() {
        return id;
    }

    public String getAccount() {
        return account;
    }

    public User getUser() {
        return user;
    }
}
