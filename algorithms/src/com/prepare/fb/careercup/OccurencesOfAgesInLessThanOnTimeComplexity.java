package com.prepare.fb.careercup;


/*Given an array of ages (integers) sorted lowest to highest, output the number of occurrences for each age. 
For instance: 
[8,8,8,9,9,11,15,16,16,16] 
should output something like: 
8: 3 
9: 2 
11: 1 
15: 1 
16: 3 

This should be done in less than O(n).
*/


public class OccurencesOfAgesInLessThanOnTimeComplexity {

	public static int[] getOccurencesOfAges(int input[]){
		
		
		// we are trying to create a 
		int [] countArray = new int[ input[ input.length -1] + 1 ]; 
		
		count( input, 0 , (input.length-1), countArray );
		
		return countArray; 
	}
	
	
	private static void count( int [] input, int begin, int end, int [] count){
		
		if( input[begin] == input[end]){
			count[input[begin]] +=  ( end - begin + 1);
		}else{
		
			count( input, begin , (begin+end)/2, count );
			count( input, (begin+end)/2 + 1 , end , count );
			
		}
	}
	
	
	public static void main(String args[]){
		System.out.println( " Occurrences of Ages in a array[]");
		
		int [] listOfAges = {8,8,8,9,9,11,15,16,16,16}; 
		System.out.println("######## Input ######");
		print(listOfAges);
		int [] occurrenceOfAges = getOccurencesOfAges(listOfAges);
		
		print(occurrenceOfAges);
		
		
	}
	
	private static void print(int[] ages){
		System.out.println("---------------------");
		for( int i=0; i< ages.length; i++){
			//if( ages[i] > 0){
				System.out.println( i + " : " +  ages[i]);
			//}
		}
	}
	
}















