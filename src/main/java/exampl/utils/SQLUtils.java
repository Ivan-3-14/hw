package exampl.utils;

import exampl.person.Person;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

import static exampl.utils.ConstantContainer.*;

public class SQLUtils {

    private SQLUtils() {}

    public static List<Person> find(
            EntityManager entityManager,
            Object parameter,
            String mainCondition,
            String fieldName,
            String additionalCondition
    ){
        String hql = String.format(FIND_STRING_FORMAT, FROM_PERSON, WHERE, fieldName, mainCondition, COLON,
                fieldName, additionalCondition
        );
        TypedQuery<Person> query = entityManager.createQuery(hql, Person.class).setParameter(fieldName, parameter);
        return query.getResultList();
    }
}
