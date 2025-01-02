import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateExample {
    public static void main(String[] args) {
        // Crear la configuración de Hibernate
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Usuario.class);

        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {

            // Iniciar una transacción
            session.beginTransaction();

            // Crear un nuevo usuario
            Usuario usuario = new Usuario("Ana", 30);
            session.save(usuario);

            // Consultar un usuario
            Usuario consultaUsuario = session.get(Usuario.class, usuario.getId());
            System.out.println("Usuario consultado: " + consultaUsuario);

            // Finalizar la transacción
            session.getTransaction().commit();
        }
    }
}
