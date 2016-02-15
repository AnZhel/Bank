package prog.kiev.ua;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Andrey on 15.02.2016.
 */

@Entity
@Table(name = "transactions")

public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Date date;

    private TransactionType operation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id")
    private Account account;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "corr_account_id")
    private Account corr_account;

    private float amount;

    public Transaction(){}

    public Transaction(Date date, TransactionType operation, Account account, Account corr_account,  float
                       amount){
        this.date = date;
        this.operation = operation;
        this.account = account;
        this.corr_account = corr_account;
        this.amount = amount;
    }

}
