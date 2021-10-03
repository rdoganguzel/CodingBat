package CodingBat.Map1;

import java.util.Map;

public class Topping1 {
    public Map<String, String> topping1(Map<String, String> map) {
        map.put("bread", "butter");
        if(map.keySet().contains("ice cream")){
            map.put("ice cream", "cherry");
        }
        return map;
    }
}
