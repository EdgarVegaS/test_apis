package cl.edgar.api.ram.utils;

import java.util.HashMap;
import java.util.Map;

public class LolApiUtils {

    public static Map<String, String> obtenerHeaders(final String apiToken){
        var map = new HashMap<String, String>();
        map.put("X-Riot-Token", apiToken);
        return map;
    }
}
