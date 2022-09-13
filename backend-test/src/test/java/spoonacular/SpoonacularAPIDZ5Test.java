package spoonacular;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;

import java.io.*;

import static org.assertj.core.api.Assertions.assertThat;

public class SpoonacularAPIDZ5Test {

    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    static class TestExecutionOrderWithOrderAnnotation {


        @BeforeAll
        static void beforeAll() {
            RestAssured.baseURI = "https://api.spoonacular.com";
            RequestSpecification base = new RequestSpecBuilder()
                    .addParam("apiKey", "6433e6be4c034cc392e307c8c8177f10")
                    .build();

        }

        @Order(1)
        @Test
        void testUsernameHash() throws IOException {
            ShoppingList shoppingList = new ShoppingList();
            JsonPath responce = RestAssured.given()
                    .queryParam("apiKey", "6433e6be4c034cc392e307c8c8177f10")
                    .body("{\n" +
                            "    \"username\": \"your user's name\",\n" +
                            "    \"firstName\": \"your user's first name\",\n" +
                            "    \"lastName\": \"your user's last name\",\n" +
                            "    \"email\": \"your user's email\"\n" +
                            "}")
                    .log()
                    .all()
                    .when()
                    .post("/users/connect")
                    .then()
                    .log()
                    .all()
                    .statusCode(Integer.parseInt("200"))
                    .extract()
                    .jsonPath();
            assertThat(responce.get("status").equals("success"));

            shoppingList.putProperties(responce.getString("username"),
                    responce.getString("hash"));

        }

        @Order(2)
        @Test
        void testAddShoppingList() throws IOException {
            ShoppingList shoppingList = new ShoppingList();
            shoppingList.getProperties();

            String url0 = "/mealplanner/" + shoppingList.getUser() + "/shopping-list/items";
            System.out.println(url0);
            RestAssured.given()
                    .queryParam("apiKey", "6433e6be4c034cc392e307c8c8177f10")
                    .queryParam("username", shoppingList.getUser())
                    .queryParam("hash", shoppingList.getHash())
                    .body("{\n" +
                            "    \"item\": \"1 package baking powder\",\n" +
                            "    \"aisle\": \"Baking\",\n" +
                            "    \"parse\": true\n" +
                            "}")
                    .log()
                    .all()
                    .expect()
                    .statusCode(Integer.parseInt("200"))
                    .time(Matchers.lessThanOrEqualTo(2600l))
                    .log()
                    .all()
                    .when()
                    .post("/mealplanner/" + shoppingList.getUser() + "/shopping-list/items");
        }

        @Order(3)
        @Test
        void testGetShoppingList() throws IOException {
            ShoppingList shoppingList = new ShoppingList();
            shoppingList.getProperties();

            String url0 = "/mealplanner/" + shoppingList.getUser() + "/shopping-list";
            System.out.println(url0);
            RestAssured.given()
                    .queryParam("apiKey", "6433e6be4c034cc392e307c8c8177f10")
                    .queryParam("username", shoppingList.getUser())
                    .queryParam("hash", shoppingList.getHash())
                    .log()
                    .all()
                    .expect()
                    .statusCode(Integer.parseInt("200"))
                    .log()
                    .all()
                    .when()
                    .get("/mealplanner/" + shoppingList.getUser() + "/shopping-list");
        }

        @Order(4)
        @Test
        void testDeleteShoppingList() throws IOException {
            ShoppingList shoppingList = new ShoppingList();
            shoppingList.getProperties();

            String url0 = "/mealplanner/" + shoppingList.getUser() + "/shopping-list/items";
            System.out.println(url0);
            RestAssured.given()
                    .queryParam("apiKey", "6433e6be4c034cc392e307c8c8177f10")
                    .queryParam("username", shoppingList.getUser())
                    .queryParam("hash", shoppingList.getHash())
                    .log()
                    .all()
                    .expect()
                    .statusCode(Integer.parseInt("200"))
                    .log()
                    .all()
                    .when()
                    .delete("/mealplanner/" + shoppingList.getUser() + "/shopping-list/items");
        }

    }
}