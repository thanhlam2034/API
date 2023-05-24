import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class APITests {

    @Test
    void test1(){
        Response response = get("https://reqres.in/api/users?page=2");
        System.out.println(response.statusCode());
        System.out.println(response.contentType());
        System.out.println(response.body().asString());
    }

    @Test
    void test2(){
        given()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(200)
                .body("data.id[0]",equalTo(7));
    }
}
