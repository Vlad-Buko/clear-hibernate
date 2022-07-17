
import entity.Principal;
import entity.School;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().addAnnotatedClass(Principal.class)
                .addAnnotatedClass(School.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();


        try {
            session.beginTransaction();
            Principal vlad = new Principal("VLad", 23);
            Principal viktor = new Principal("Viktor", 19);
            School school = new School();
            school.setSchoolNumber(21);
            school.setPrincipal(vlad);
            session.save(vlad);
            session.save(school);


            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }
    }
}
