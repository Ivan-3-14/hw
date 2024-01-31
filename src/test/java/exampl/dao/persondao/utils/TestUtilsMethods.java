package exampl.dao.persondao.utils;

import exampl.person.Person;
import org.junit.Assert;

public class TestUtilsMethods {

    private TestUtilsMethods() {}

    public static void myAssert(Person entityPerson, Person person) {
        Assert.assertNotNull(entityPerson);
        Assert.assertEquals("age not equals", entityPerson.getAge(), person.getAge());
        Assert.assertEquals("salary not equals", entityPerson.getSalary(), person.getSalary());
        Assert.assertEquals("passport not equals", entityPerson.getPassport(), person.getPassport());
        Assert.assertEquals("address not equals", entityPerson.getAddress(), person.getAddress());
        Assert.assertEquals("date of birthday not equals", entityPerson.getDateOfBirthday(), person.getDateOfBirthday());
        Assert.assertEquals("time to lunch not equals", entityPerson.getTimeToLunch(), person.getTimeToLunch());
        Assert.assertEquals("data time create not equals", entityPerson.getDataTimeCreate(), person.getDataTimeCreate());
    }
}
