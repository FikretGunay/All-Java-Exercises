package IntegrationTest;
import static io.restassured.RestAssured.*;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class UserApiIntegrationTest {
    @Test
    public void testApiFetchUser_ONE(){
        given().baseUri("https://jsonplaceholder.typicode.com")
                .when().get("/users/1")
                .then().assertThat().statusCode(200)
                .body("name", equalTo("Leanne Graham"))
                .body("email", equalTo("Sincere@april.biz"));
    }
    @Test
    public void testApiFetchUser_TWO(){
        given().baseUri("https://jsonplaceholder.typicode.com")
                .when().get("/users/2")
                .then().assertThat().statusCode(200)
                .body("name", equalTo("Ervin Howell"))
                .body("email", equalTo("Shanna@melissa.tv"));
    }
    //Övning1-2 Kontrollera response body
    @Test
    public void testApiFetchPost(){
        given().baseUri("https://jsonplaceholder.typicode.com")
                .when().get("/posts/1")
                .then().assertThat().statusCode(200)
                .body("title",equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"));
    }
    //övning3-Path parameter för att hämta en specifik användare
    @Test
    public void testApiPathParameters(){
        given().baseUri("https://jsonplaceholder.typicode.com")
                .pathParam("userId",1)
                .when().get("/users/{userId}")
                .then().assertThat().statusCode(200);
    }
//övning4: query parameters för att söka efter inlägg från en spec. användare
    @Test
    public void testApiQueryParameters(){
        given().baseUri("https://jsonplaceholder.typicode.com")
                .queryParam("userId", 1)
                .when().get("/posts")
                .then().assertThat().statusCode(200)
                .and().body("[1].userId",equalTo(1));
    }



}
