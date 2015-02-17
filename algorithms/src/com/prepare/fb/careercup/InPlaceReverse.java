package com.prepare.fb.careercup;

public class InPlaceReverse {
     /* testing scenarios
      * 
      * 1. null input
      * 2. more than one blank in a sentence
      * 3. starting with blank
      * 4. only blanks
      * 
      * 
      * 
      * 
      */
	
	
	
	public String reverseSentenceByWords(String input){
		
		 if( input == null || input.isEmpty()){
			   new RuntimeException(" Error : Invalid input. Input can not be empty !!");
		   }

		 
		char[] inputReversed = reverseChars(input.toCharArray(), 0 , input.length() -1);
		System.out.println(new String(inputReversed));
		
		
		int startIndex = 0;
		int endIndex = 0;
		while( startIndex < inputReversed.length -1 ){
			
			startIndex =  calculateStartIndex(inputReversed, startIndex);
			
			endIndex = calculateEndIndex(inputReversed,  startIndex);
			
			reverseChars(inputReversed, startIndex, endIndex);
			startIndex = endIndex+1;
		}
		
		
		return new String(inputReversed);
	}
	
	
	private int calculateStartIndex(char[] inputCharArray, int startIndex){
		
	
		char blankspace = ' ';
		// Find the first non blank space character in the char array after startIndex;
		
		while(inputCharArray[startIndex] == blankspace){
			startIndex++;
		}
		
		return startIndex;
	}
	
	
	
	private int calculateEndIndex(char[] inputCharArray, int startIndex){
		
		// End index not available
		if( startIndex >= inputCharArray.length || startIndex < 0){
			return -1;
		}
	
		char blankspace = ' ';
		int endIndex =  startIndex;
		
		while( endIndex < inputCharArray.length && inputCharArray[endIndex] != blankspace ){
			endIndex++;
		}
		
		// Invalid endIndex
		 if( endIndex-1 < 0){
			   	return -1; 
		   }
		
		return endIndex-1;
		
	}
	
	
	private char[] reverseChars( char[] inputChars, int startInd, int endInd){
	   
	   char temp;
	   int startIndex = startInd;
	   int endIndex  = endInd;
	   
	   while( startIndex <= endIndex){
		   if( inputChars[startIndex] != inputChars[endIndex]){
			   temp = inputChars[startIndex];
			   inputChars[startIndex] =  inputChars[endIndex];
			   inputChars[endIndex]  =  temp;
		   }
		   
		   startIndex++;
		   endIndex--;
	   }
		
	   
	  // System.out.println("Reverse Chars : " + inputChars);
	   
	   
		return inputChars;
	}
	
	
	public static void main(String args[]){
		
		String input = "This is a sentence";
		InPlaceReverse ipr =  new InPlaceReverse();
		String inputReverse =  ipr.reverseSentenceByWords(input);
		
		System.out.println(" Reverse String : " +  inputReverse);
		
	}
}
