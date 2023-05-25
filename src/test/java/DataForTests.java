import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class DataForTests {

    @DataProvider(name = "DataForPost")
    public Object[][] dataForPost(){
//        Object[][] data = new Object[2][3];
//        data[0][0] = "Albert";
//        data[0][1] = "Einstein";
//        data[0][2] = 2;
//
//        data[1][0] = "Thomas";
//        data[1][1] = "Edison";
//        data[1][2] = 1;
//        return data;

        return new Object[][]{
                {"Graham", "Bell", 1},
                {"Herry","ford", 2}
        };
    }
}
