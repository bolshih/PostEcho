import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

  @Test
  void PostmanEchoTest() {
    given()
            .baseUri("https://postman-echo.com")
            .body("kakito dann") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
            .when()
            .post("/post")
// Проверки
            .then()
            .statusCode(200)
            .body("data", equalTo("kakito danye"))
    ;
  }
}
