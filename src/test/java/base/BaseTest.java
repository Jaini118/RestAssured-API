package base;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import utils.ConfigReader;

import static io.restassured.RestAssured.given;

public class BaseTest {
    protected RequestSpecification reqSpec;

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = ConfigReader.getProperty("baseURI");
        reqSpec = given().header("Content-Type", "application/json");
    }
}