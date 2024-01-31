package exampl.utils;

import exampl.person.Person;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

import static exampl.utils.ConstantContainer.*;

public class MethodUtils {

    private MethodUtils() {}

    public static List<Person> find(
            Session session,
            Object parameter,
            String mainCondition,
            String fieldName,
            String additionalCondition
    ){
        String hql = String.format(FIND_STRING_FORMAT, FROM_PERSON, WHERE, fieldName, mainCondition, COLON,
                fieldName, additionalCondition
        );
        Query<Person> query = session.createQuery(hql, Person.class).setParameter(fieldName, parameter);
        return query.list();
    }
}
