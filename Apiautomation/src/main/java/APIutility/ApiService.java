package APIutility;
import io.restassured.http.Header;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ApiService {

    public static Response getResponseForGetApi(Map<String, Object> body,  Header cookie) {
        return given()
                .header(cookie)
                .params(body)
                .when()
                .get()
                .then()
                .extract().response();
    }

    public static LinkedHashMap<String, Object> buildQueryParams(String key, String value, LinkedHashMap<String, Object> map) {
        map.put(key, value);
        return map;
    }
}
