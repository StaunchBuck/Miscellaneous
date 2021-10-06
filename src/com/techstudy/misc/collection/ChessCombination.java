package com.techstudy.misc.collection;

import java.math.BigInteger;

public class ChessCombination {

	public static void main(String[] args) {
		new ChessCombination().count(10000);

	}

	private  int count(int i) {
		
		//nCr
		BigInteger numerator = ChessCombination.factorial(i);
		BigInteger denominator = ChessCombination.factorial(i-2);
		BigInteger temp = numerator.divide(denominator);
		BigInteger result = temp.divide(BigInteger.valueOf(2));
		System.out.println(result);
		return result.intValue();
	}
	
	private static BigInteger factorial(int i) {
		if(i == 0)
			return BigInteger.valueOf(1);
		return BigInteger.valueOf(i).multiply(factorial(i-1));
		
//		BigInteger[] dp=new BigInteger[i+1];
//		
//		dp[0]=BigInteger.valueOf(1);
//		
//		for(i=1;i<dp.length;i++) 
//		{
//			dp[i] = dp[i-1].multiply(BigInteger.valueOf(i));
//		}
//		return dp[dp.length-1];
	}

}
