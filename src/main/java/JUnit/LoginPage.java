package JUnit;

public class LoginPage {
    DataBase database;
    public LoginPage (DataBase database){

        this.database=database;
    }
    public String login(String username, String password){
        if (database.login(username, password)){
            return "inloggad";
        } else{
            return "inloggningen misslyckades";
        }

    }
}
