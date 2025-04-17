package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import utils.PayloadManager;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class UserAPITest extends BaseTest {

    @Test
    public void createUserTest() throws IOException {
        String payload = PayloadManager.getCreateUserPayload();

        given()
            .spec(reqSpec)
            .body(payload)
        .when()
            .post("/users")
        .then()
            .statusCode(201)
            .body("name", equalTo("Virat"))
            .body("job", equalTo("Cricketer"));
    }
}