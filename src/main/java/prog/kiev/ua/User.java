package prog.kiev.ua;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Andrey on 15.02.2016.
 */
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String login;
    private String password;

    public User(){}

    public User(String name, String login, String password){
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
