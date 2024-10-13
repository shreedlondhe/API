package Requests;


import ReqResBuilder.SpecBuilder;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.Map;



public class Request {

public  Response get(Map<String,String> headers, String endpoints){

    return RestAssured.given().spec(SpecBuilder.RequestSpecBuilder()).headers(headers).when().get(endpoints).then()
            .spec(SpecBuilder.ResponceSpecBuilder())
             .log().ifError().extract().response();
    }
    public  Response get( String endpoints){

        return RestAssured.given().spec(SpecBuilder.RequestSpecBuilder()).when().get(endpoints).then()
                .spec(SpecBuilder.ResponceSpecBuilder())
                .log().ifError().extract().response();
    }

public void post(){

}

}
