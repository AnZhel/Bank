package prog.kiev.ua;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    static EntityManagerFactory emf;
    static EntityManager em;
    private User currentUser;
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        try{
            emf = Persistence.createEntityManagerFactory("Bank");
            em = emf.createEntityManager();
            try {
                User user = login(scanner);
                if (user==null){
                    scanner.close();
                    em.close();
                    emf.close();
                    return;
                }
                while (true){
                    System.out.println("1");
                }
            }
            finally {
                scanner.close();
                em.close();
                emf.close();
            }
        }
        catch (Exception ex){ex.printStackTrace();

        }
    }

    static User login(Scanner scanner){
        System.out.println("Input login:");
        String login = scanner.nextLine();
        System.out.println("Input password");
        String password = scanner.nextLine();
        Query query = em.createQuery("Select u FROM User u WHERE u.login= :login and u.password= :password");
        query.setParameter("login",login);
        query.setParameter("password", password);
        User user = (User) query.getSingleResult();
        if (user==null){

        }
        return user;

    }

    static User register(){

    }
}
