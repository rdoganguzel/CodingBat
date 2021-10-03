package CodingBat.Map1;

import java.util.Map;

public class mapAB {
    public Map<String, String> mapAB(Map<String, String> map) {
        if(map.keySet().contains("a") && map.keySet().contains("b")){
            map.put("ab", map.get("a")+map.get("b"));
        }
        return map;
    }
}
