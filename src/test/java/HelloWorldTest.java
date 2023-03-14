import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;


public class HelloWorldTest {
    @Test
    public void testRestAssured(){
        JsonPath response = RestAssured
                .given()
                .get("https://playground.learnqa.ru/api/get_json_homework")
                .jsonPath();

        System.out.println ((String) response.get("messages[1].message"));
    }
}
