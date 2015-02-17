package com.prepare.fb.careercup;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SmallestStringWithAllCharactersInaSet {

	/*
	 * Find the smallest substring of the string containing all the characters in the set. 

		ex: 
		Set : [a, b, c] 
		String : "abbcbcbaa" 
		
		Result: "cba"
	 * 
	 */
	
	
	private static final boolean Character = false;


	public String getSmallestSubStringContainingAllChars(String input, HashMap<Character, Integer> charSet){
		
		int startIndex = 0;
		int lastIndexOfSubString = 0;
		boolean firstSubstringFound = false;
		
		/*while(!copyCharSet.isEmpty()){
			Character tempChar = input.charAt(lastIndexOfSubString);
			if(copyCharSet.contains(tempChar)){
				copyCharSet.remove(tempChar);
			}
			lastIndexOfSubString++;
		}
	*/
		while( lastIndexOfSubString < input.length() -1 ){
			Character tempChar = input.charAt(lastIndexOfSubString);
			
			Integer charCount = charSet.get(tempChar); 
			if(charCount != null){
				charSet.put(tempChar, charCount.intValue()+1);
				
			}
		}
		
		return null;
	}
	
	
	
	
	public static void main(String args []){
		System.out.println(" ################################### ");
	
		
	}
	

}
