package ReqResBuilder;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SpecBuilder {


    static Properties prob;

    static{

        prob=new Properties();
        try {
            prob.load(new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Config\\config.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public static RequestSpecification RequestSpecBuilder() {
        RequestSpecBuilder RCB=new RequestSpecBuilder();
        System.out.println("Base URL = "+prob.getProperty("baseUrl"));
      RCB.setBaseUri(prob.getProperty("baseUrl"));
      RCB.addHeader("Content-Type", "application/json");
        RequestSpecification RE=RCB.build();
     return RE;
    }

    public static ResponseSpecification ResponceSpecBuilder(){
        ResponseSpecBuilder RC = new ResponseSpecBuilder();
        RC.log(LogDetail.ALL);
        ResponseSpecification RE=RC.build();
        return RE;

    }

}

