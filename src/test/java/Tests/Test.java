package Tests;


import Endpoints.*;
import Payloads.PayloadUtils;
import Requests.Request;
import org.testng.annotations.BeforeMethod;


public class Test {

    static Request Re;
@BeforeMethod
    public static void setup(){
        Re=new Request();
    }

@org.testng.annotations.Test
   public void get(){
     Re.get(null,EndPoints.listUsers).then().statusCode(200);

    }
    @org.testng.annotations.Test
    public void post(){
    Re.post(null,PayloadUtils.payload("create"),EndPoints.createUser)
            .then().statusCode(201);
    }
    @org.testng.annotations.Test
    public void post_register(){
        Re.post(null,PayloadUtils.payload("register"),EndPoints.register)
                .then().statusCode(200);
    }

    @org.testng.annotations.Test
    public void delete(){
        Re.delete(null,EndPoints.deleteUser).then().statusCode(204);
    }

    @org.testng.annotations.Test
    public void updateUser(){
        Re.put(null,PayloadUtils.payload("updateUser"),EndPoints.putUser)
                .then().statusCode(200);
    }

}

