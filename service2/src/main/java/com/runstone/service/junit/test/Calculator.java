package com.runstone.service.junit.test;

public class Calculator {

	
	public int evaluate(String expression) {
	    int sum = 0;
	    for (String summand: expression.split("\\+"))
	      sum += Integer.valueOf(summand);
//	      sum -= Integer.valueOf(summand);
	    return sum;
	  }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
