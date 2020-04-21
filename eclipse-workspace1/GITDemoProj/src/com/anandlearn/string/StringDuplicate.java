package com.anandlearn.string;

import java.util.HashMap;
import java.util.Set;

public class StringDuplicate {
	
	static void Duplicatecount(String inputString) {
		HashMap<Character,Integer>charcountmap=new HashMap<Character,Integer>();
		char[] inputArray = inputString.toCharArray();
		for(char c:inputArray) {
			if(charcountmap.containsKey(c)) {
				charcountmap.put(c, charcountmap.get(c)+1);
			}
			else {
				charcountmap.put(c, 1);
			}
			
		}
		Set<Character>charInString=charcountmap.keySet();
		for(char ch:charInString) {
			if(charcountmap.get(ch)>1) {
				System.out.println(ch+":"+charcountmap.get(ch));
			}
		}
				
		
	}

	public static void main(String[] args) {
		
		Duplicatecount("Attitude");
	}

}
