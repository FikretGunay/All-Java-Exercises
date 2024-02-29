package JUnit;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void GetFullNameTest(){
        Person person = new Person("Zeynep", "Gunay");
        String result= person.getFullName();
        assertEquals("Zeynep Gunay", result);
    }
}
