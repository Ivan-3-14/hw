package exampl.dao.persondao;

import exampl.dao.persondao.utils.TestUtilsMethods;
import exampl.enums.Parameters;
import exampl.person.Person;
import exampl.utils.HibernateUtil;
import exampl.dao.persondao.utils.MockUtils;
import junit.framework.TestCase;
import org.hibernate.Session;

import javax.persistence.EntityManager;

import static exampl.utils.ConstantContainer.EQUALS;
import static exampl.utils.ConstantContainer.NULL_CONDITION;


public class PersonDAOImplTest extends TestCase {


    public void testSave() {
        Person person = MockUtils.getTestPerson();
        EntityManager entityManager = HibernateUtil.getEntityManager();
        Session session = entityManager.unwrap(Session.class);

        PersonDAOImpl personDAO = new PersonDAOImpl(session);

        personDAO.save(person);

        Person entityPerson = entityManager.find(Person.class, 2);
        TestUtilsMethods.myAssert(entityPerson, person);

        session.close();
        entityManager.close();
    }


    public void testFindByParameter() {
        Person person = MockUtils.getTestPerson2();
        EntityManager entityManager = HibernateUtil.getEntityManager();
        Session session = entityManager.unwrap(Session.class);

        PersonDAOImpl personDAO = new PersonDAOImpl(session);

        personDAO.save(person);

        Person entityPerson = personDAO.findByParameter(Parameters.DATA_TIME_CREATED, EQUALS,
                String.valueOf(person.getDataTimeCreate()), NULL_CONDITION).get(0);
        TestUtilsMethods.myAssert(entityPerson, person);

        entityPerson = personDAO.findByParameter(Parameters.AGE, EQUALS, person.getAge(), NULL_CONDITION).get(0);
        TestUtilsMethods.myAssert(entityPerson, person);

        entityPerson = personDAO.findByParameter(Parameters.SALARY, EQUALS, person.getSalary(), NULL_CONDITION).get(0);
        TestUtilsMethods.myAssert(entityPerson, person);

        entityPerson = personDAO.findByParameter(Parameters.PASSPORT, EQUALS, person.getPassport(), NULL_CONDITION).get(0);
        TestUtilsMethods.myAssert(entityPerson, person);

        entityPerson = personDAO.findByParameter(Parameters.ADDRESS, EQUALS, person.getAddress(), NULL_CONDITION).get(0);
        TestUtilsMethods.myAssert(entityPerson, person);

        entityPerson = personDAO.findByParameter(Parameters.DATE_OF_BIRTHDAY, EQUALS,
                String.valueOf(person.getDateOfBirthday()), NULL_CONDITION).get(0);
        TestUtilsMethods.myAssert(entityPerson, person);

        entityPerson = personDAO.findByParameter(Parameters.TIME_TO_LUNCH, EQUALS,
                String.valueOf(person.getTimeToLunch()), NULL_CONDITION).get(0);
        TestUtilsMethods.myAssert(entityPerson, person);

        session.close();
        entityManager.close();
    }
}