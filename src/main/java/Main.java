import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        while (true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Exe test effect,please click any key:");
            if(scan.hasNext()){
                String str = scan.next();
            }
            String s="{\n" +
                    "    \"name\":\"tom\",\n" +
                    "    \"age\":10\n" +
                    "}";
            HashMap<String, String> map = new ObjectMapper().readValue(s, new TypeReference<HashMap<String, String>>() {
            });
            for (Map.Entry<String,String> m:map.entrySet()){
                System.out.println(m);
            }
        }
    }
}
