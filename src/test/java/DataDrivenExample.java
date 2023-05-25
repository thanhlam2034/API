import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DataDrivenExample extends DataForTests{

    @Test(dataProvider = "DataForPost")
    public void Test_2_POST(String firstname, String lastname, int subjectId){
        baseURI = "http://localhost:3000/";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("firstname", firstname);
        jsonObject.put("lastname", lastname);
        jsonObject.put("subjectId", subjectId);

        given().header("Content-Type", "application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(jsonObject.toJSONString()).
                when().
                post("/users").
                then().
                statusCode(201).
                log().all();
    }
    @Parameters({"userId"})
    @Test()
    public void test_delete(int userId){
        baseURI = "http://localhost:3000/";

        when().delete("/users/" + userId).
                then().statusCode(200);
    }
}
