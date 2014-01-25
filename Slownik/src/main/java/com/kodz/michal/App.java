package com.kodz.michal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		
		//btn wczytaj slowka
		//dodaj slowka
		//zapisz liste tam gdzie chesz
		//wczytaj liste z tamtad gdzie chesz
		//zapis do csv
		//odczy do csv po linijce
		
		HashMap<Integer, Word> map = new HashMap<Integer, Word>();

		Word word1 = new Word("kot", "chat", Kind.le);
		Word word2 = new Word("pies", "chien", Kind.le);
		Word word3 = new Word("koñ„", "cheval", Kind.le);
		
		map.put(word1.hashCode(), word1);
		map.put(word2.hashCode(), word2);
		map.put(word3.hashCode(), word3);
		
for (Entry<Integer, Word> entry : map.entrySet()) {
//	System.out.println(entry.getValue().getId());
}		
		System.out.println(map);
		
//		System.out.println(map.containsKey(word2.hashCode()));
		
	
	List<Word> lista = new ArrayList<Word>();
	lista.add(word1);
	lista.add(word2);
	lista.add(word3);
//	System.out.println(lista.contains(word2));
	
	Set<Word> set = new HashSet<Word>();
	set.add(word2);
	set.add(word1);
	set.add(word3);
	
	for (Word word : set) {
//		if(word.getPolishWord().equals("kot"))
//		System.out.println(word);
	}

	
	
	}
	
	
	

}
