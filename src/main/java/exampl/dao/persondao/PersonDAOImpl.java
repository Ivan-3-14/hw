package exampl.dao.persondao;

import exampl.enums.Parameters;
import exampl.person.Person;
import exampl.utils.SQLUtils;
import exampl.utils.Printer;

import javax.persistence.EntityManager;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import static exampl.utils.ConstantContainer.*;

public class PersonDAOImpl implements PersonDAO {

    private final EntityManager entityManager;

    public PersonDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void save(Person person) {
        entityManager.getTransaction().begin();
        entityManager.persist(person);
        Printer.printSuccessfulSaveMethodMessage();
        entityManager.getTransaction().commit();
    }

    @Override
    public List<Person> findByParameter(Parameters parameterName, String mainCondition, Object parameter,
                                        String additionalCondition
    ) {
        List<Person> list = new ArrayList<>();
        entityManager.getTransaction().begin();
        try {
            switch (parameterName) {
                case AGE:
                    list = SQLUtils.find(entityManager, parameter, mainCondition, STRING_AGE, additionalCondition);
                    break;
                case SALARY:
                    list = SQLUtils.find(entityManager, parameter, mainCondition, STRING_SALARY, additionalCondition);
                    break;
                case PASSPORT:
                    list = SQLUtils.find(entityManager, parameter, mainCondition, STRING_PASSPORT, additionalCondition);
                    break;
                case ADDRESS:
                    list = SQLUtils.find(entityManager, parameter, mainCondition, STRING_ADDRESS, additionalCondition);
                    break;
                case DATE_OF_BIRTHDAY:
                    list = SQLUtils.find(entityManager, Date.valueOf(String.valueOf(parameter)), mainCondition,
                            STRING_DATE_OF_BD, additionalCondition
                    );
                    break;
                case TIME_TO_LUNCH:
                    list = SQLUtils.find(entityManager, Time.valueOf(String.valueOf(parameter)), mainCondition,
                            STRING_TIME_TO_LUNCH, additionalCondition);
                    break;
                case DATA_TIME_CREATED:
                    list = SQLUtils.find(entityManager, Timestamp.valueOf(String.valueOf(parameter)), mainCondition,
                            STRING_DATA_TIME_CREATE, additionalCondition);
                    break;
                case ID:
                    list = SQLUtils.find(entityManager, parameter, mainCondition, STRING_ID, additionalCondition);
                    break;
                default:
                    throw new IllegalStateException(ILL_ST_EX + parameter);
            }
        } catch (ClassCastException | IllegalArgumentException e) {
           Printer.printFindByParamExceptionMessage();
        } finally {
            entityManager.getTransaction().commit();
        }
        return list;
    }
}
