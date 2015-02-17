package com.javatry.deadlock;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;


public class Parent1 {

	public List<String> abcLIst;
	private String parentString = "Parent";
	
	public class innerAB{
		
		private String child = "child";
		
		public void innerMethod(){
			System.out.println( " parentString " + parentString);
		}
	}
	
	public void pMethod( ArrayList<String> s){
		
		s.add("khurram");
		
		s.add("khurram");
		//abcLIst.size();
		
		innerAB ab = new innerAB();
		System.out.println(" Child " + ab.child );
		ab.innerMethod();
	}
	
	public static void main(String args[]){
	/*	Random r = new Random();
		int result= r.nextInt(7);
		System.out.println(new Integer(1234567));*/
		
	/*	
		int x = 5;
		int y = 0;
		
		System.out.println( x/y);
		*/
		
		ArrayList<String> s = new ArrayList<String>();
		Parent1 p = new Parent1();
		p.pMethod(s);
		
		System.out.println("" + s.size());
		
	}
	
	
}
