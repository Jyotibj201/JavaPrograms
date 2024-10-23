package JavaPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Capgemeni_Aaabbbbcc {

	public static void main(String[] args) {
		HashMap<Character, Integer> hashmap=new HashMap<Character, Integer>();
		String s="accaaabbbhhhhssssss";
		char[] strArray =s.toCharArray();
		for(Character ch:strArray){
			if(hashmap.containsKey(ch)){
				hashmap.put(ch, hashmap.get(ch)+1);

			}
			else{
				hashmap.put(ch, 1);
			}
		}
		System.out.println(hashmap);


	}

}
