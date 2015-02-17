package com.prepare.fb.careercup;

public class PalindromePlus {

	public static void main(String args[]){
		
		checkPalindrome(""); 
		checkPalindrome("A man, a plan, a canal -- Panama!");
		checkPalindrome("aaaaa"); // ALL same character
		checkPalindrome("AAaaAAaa");  // Same character different case
		checkPalindrome("ab cc ba"); // Space in between
		checkPalindrome("ab !!###cc&&& ba"); // special characters in between
		checkPalindrome("ram ab !!###cc&&& ba  mar"); // Space in between
		
		checkPalindrome("ram ab !c&&& ba  mar"); // Space and special character in between
		checkPalindrome("ram ab !!###cc&&& ba  mar"); // Space in between
		checkPalindrome("ram ab !c&&& ba  mark"); // not a palindrome
		
	}
	
	public static void checkPalindrome(String str){
		System.out.println(" String : " + str + "  [ isPalindrome = " + isPalindrome(str) + "]");
	}
	
	public static boolean isPalindrome(String str){
		
		int forwardPointer = 0;
		int backwardPointer = str.length() - 1;
		
		while( forwardPointer < backwardPointer){
			
			if( !Character.isLetter(str.charAt(forwardPointer))){
				forwardPointer++;
				continue;
			}
			
			if( !Character.isLetter(str.charAt(backwardPointer))){
				backwardPointer--;
				continue;
			}
			
			if( Character.toLowerCase(str.charAt(forwardPointer)) !=  Character.toLowerCase(str.charAt(backwardPointer)) ){
				return false;
			}
			
			forwardPointer++;
			backwardPointer--;
		}
		
		return true;
		
	}
	
	
	
	
}
