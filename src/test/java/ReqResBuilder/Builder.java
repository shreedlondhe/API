package ReqResBuilder;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;

import java.util.Properties;

public class Builder {
    static Properties prob;

//    static{
//
//        prob=new Properties();
//        try {
//            prob.load(new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Config\\config.properties"));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//    }


    public static RequestSpecification RequestSpecBuilder() {
        RequestSpecBuilder RCB=new RequestSpecBuilder();
        System.out.println("Base URL = "+prob.getProperty("baseUrl"));
      RCB.setBaseUri(prob.getProperty("baseUrl"));
      RCB.addHeader("Content-Type", "application/json");
      return RCB.build();

    }

    public static void ResponceSpecBuilder(){
        ResponseSpecBuilder RCB = new ResponseSpecBuilder();

    }

}

