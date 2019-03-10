package impl;

import iterativeOne.AddOddNum;
import recursiveOne.AddOdd;
public class Test {
	public static void main(String args[]) {
		
		AddOddNum a1= new AddOddNum(9999);
		System.out.println(a1.AddOdd());
	
		AddOdd a2 = new AddOdd();
		System.out.println(a2.addOdd(9999));
	}
}
