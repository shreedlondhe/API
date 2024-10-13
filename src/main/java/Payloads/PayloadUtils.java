package Payloads;

import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PayloadUtils {



    public static String payload(String fileNamme) {


        String filePath = System.getProperty("user.dir")+"/src/main/java/Payloads/payloads/"+fileNamme+".js";
        String content;
        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        JSONObject jsonObject = new JSONObject(content);
        return jsonObject.toString();


    }

}
