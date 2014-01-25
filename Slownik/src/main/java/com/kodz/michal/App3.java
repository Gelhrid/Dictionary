package com.kodz.michal;

import java.util.Map;
import java.util.TreeMap;

public class App3 {

	public static void main(String[] args) {
		Map<String, Integer> words = new TreeMap<String, Integer>();
		words.put("ala", words.get("ala")==null ? 1 : words.get("ala").intValue()+1);
		words.put("ala", words.get("ala")==null ? 1 : words.get("ala").intValue()+1);
		words.put("ala", words.get("ala")==null ? 1 : words.get("ala").intValue()+1);
		words.put("ala", words.get("ala")==null ? 1 : words.get("ala").intValue()+1);
		words.put("ala", words.get("ala")==null ? 1 : words.get("ala").intValue()+1);
		words.put("ala", words.get("ala")==null ? 1 : words.get("ala").intValue()+1);
		words.put("ala", words.get("ala")==null ? 1 : words.get("ala").intValue()+1);
		words.put("b", words.get("b")==null ? 1 : words.get("b").intValue()+1);
		words.put("c", words.get("c")==null ? 1 : words.get("c").intValue()+1);
		words.put("c", words.get("c")==null ? 1 : words.get("c").intValue()+1);
		words.put("d", words.get("d")==null ? 1 : words.get("d").intValue()+1);
		words.put("d", fun());
		
//		words.get("ala").intValue();
		System.out.println(words);
//		words.get(words).

	}
	public static Integer fun(){
		return 44;
	}

}
