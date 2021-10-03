package CodingBat.Map1;

import java.util.Map;

public class MapAB2 {
    public Map<String, String> mapAB2(Map<String, String> map) {
        String str1 = map.get("a");
        String str2 = map.get("b");
        if (map.containsKey("a") && map.containsKey("b") && str1.equals(str2)) {
                map.remove("a");
                map.remove("b");
        }
        return map;
    }
}
