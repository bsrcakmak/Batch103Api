package get_requests;

import base_url.HerOkuAppBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Get05 extends HerOkuAppBaseUrl {

     /*
    Given
        https://restful-booker.herokuapp.com/booking
    When
        User sends a GET request to the URL
    Then
        Status code is 200
    And
        Among the data there should be someone whose firstname is "Sally" and last name is "Brown"
        (Data içerisinde firstname değeri "Sally", lastname değeri "Brown" olan biri olmalı)
 */

    @Test
    public void get05() {

        // Set the URL  ==> request specification
        spec.
                pathParam("first", "booking").
                queryParams("firstname","Sally","lastname","Brown");

        // Set the expected data

        // Send the request
        Response response = given().spec(spec).when().get("/{first}");
        response.prettyPrint();

        // Do assertion


    }
}