import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class TesteConexao {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexaoPrincipal");
        EntityManager em = emf.createEntityManager();

        System.out.println("Conectado ao banco de dados!");

        em.close();
        emf.close();
    }
}
