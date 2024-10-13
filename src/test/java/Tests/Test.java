package Tests;


import Endpoints.EndPoints;
import Requests.Request;
import org.testng.annotations.*;

public class Test {

    static Request Re;
    @BeforeMethod
    public static void setup(){
        Re=new Request();
    }

  @org.testng.annotations.Test
   public void get(){
     Re.get(EndPoints.listUsers);

    }
}

