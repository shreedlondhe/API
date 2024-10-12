package Requests;
import ReqResBuilder.Builder;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.Map;



public class Request {

public static Response get(Map<String,String> headers, String endpoints){
    return RestAssured.given().spec(Builder.RequestSpecBuilder()).headers(headers).when().get(endpoints).then()
             .log().ifError().extract().response();
    }



}
