package Requests;


import ReqResBuilder.SpecBuilder;
import io.restassured.RestAssured;
import io.restassured.response.Response;


import java.util.Map;



public class Request {

public Response get(Map<String,String> headers, String endpoints){

    return RestAssured.given().spec(SpecBuilder.RequestSpecBuilder()).headers(headers).when().get(endpoints)
            .then()
            .spec(SpecBuilder.ResponceSpecBuilder())
             .log().ifError().extract().response();
    }


public Response post(Map<String,String> headers, String payload, String endpoints){

return RestAssured.given().spec(SpecBuilder.RequestSpecBuilder()).body(payload).when().post(endpoints)
        .then().spec(SpecBuilder.ResponceSpecBuilder()).extract().response();

}

public Response delete(Map<String,String> headers, String endpoints){
    return RestAssured.given().spec(SpecBuilder.RequestSpecBuilder()).when().delete(endpoints)
            .then().spec(SpecBuilder.ResponceSpecBuilder()).extract().response();
}

    public Response put(Map<String,String> headers, String payload, String endpoints){

        return RestAssured.given().spec(SpecBuilder.RequestSpecBuilder()).body(payload).when().put(endpoints)
                .then().spec(SpecBuilder.ResponceSpecBuilder()).extract().response();

    }
}
