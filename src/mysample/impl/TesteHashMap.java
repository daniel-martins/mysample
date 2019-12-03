package mysample.impl;

import java.util.HashMap;
import java.util.Map;

public class TesteHashMap {
	
	
	public void caregarDadosnoHashMap(String path) {
		Map<String, String> map = new HashMap();
		
		map.put("K1", "V1");
		map.put("K2", "V2");
		map.put("K3", "V3");
		map.put("K4", "V4");
		map.put("K5", "V5");
		map.put("K6", "V6");
		map.put("K7", "V7");
		map.put("K8", "V8");
		map.put("K9", "V9");
		map.put("K10", "V10");
		
		System.out.println(map.get("K10"));
		
		
	}

}
