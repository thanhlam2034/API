import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class Test_POST {

    @Test
    void Test_1(){

//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("name", "morpheus");
//        map.put("job", "leader");

        JSONObject request = new JSONObject();
        request.put("name", "morpheus");
        request.put("job", "leader");

        System.out.println(request);

        given().
                header("Content-Type", "application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                    post("https://reqres.in/api/users").
                then().
                statusCode(201);
    }

}
