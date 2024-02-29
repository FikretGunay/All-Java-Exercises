package JUnit;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.junit.Assert.assertEquals;

public class LoginTest {
    @Test
    public void testLogin(){
        DataBase databaseMock = mock(DataBase.class);

        when(databaseMock.login("Zeynep", "123")).thenReturn(true);

        LoginPage loginPage= new LoginPage(databaseMock);

        loginPage.login("Zeynep","123");

        String result= loginPage.login("Zeynep","123");
        assertEquals("Du är inlogged",result);

    }

}
