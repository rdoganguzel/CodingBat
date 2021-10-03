package CodingBat.Map1;

import java.util.Map;

public class mapShare {

    public Map<String, String> mapShare(Map<String, String> map) {

        if (map.keySet().contains("a")) {
            map.put("b", map.get("a"));
        }
        if (map.keySet().contains("c")) {
            map.remove("c");
        }
        return map;
    }
}
