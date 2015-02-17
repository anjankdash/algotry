package com.prepare.fb.careercup;

public class PerfectSquareProblem {

	public static void printAllDoubleSquares(int n){
		//System.out.println(" Print All squares : " +  n);
		

	
	// Number should be less than  sqrt(n-1)
		int maxNum = (int) Math.sqrt(new Double(n)) + 1;
	
	//int maxNum = (int) n/2;
	
	for( int i = 1; i<=maxNum/2; i++){
		int firstSquare =  i*i;
		int secondSquare = n-firstSquare;		
		double secondNumberCalculatedDouble = (double)Math.sqrt(secondSquare); 
		int secondNumberCalculatedInt =  (int) secondNumberCalculatedDouble;
		
		
		if(secondNumberCalculatedDouble == secondNumberCalculatedInt ){
		
			//System.out.println( "Numbers are "+ i*i + " + " + (secondNumberCalculatedInt)*(secondNumberCalculatedInt) + " = " + n );
			System.out.println( "Numbers are "+ i + " square + " + (secondNumberCalculatedInt) + " square = " + n  );
			
		}
	}
		
		
	}
	
	public static void main(String args[]){
		
		/*for(int i = 1 ; i < 1000; i++){
			printAllDoubleSquares(i);	
		}*/
		
		printAllDoubleSquares(985);
		
		
	}
	
}
