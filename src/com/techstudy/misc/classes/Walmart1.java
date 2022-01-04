package com.techstudy.misc.classes;

public class Walmart1 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Subhasish is a developer");
		//String s1 = "repoleved a si hsisahbus";		
		int start = 0;
		int end = sb.length()-1;
		
		while(start<end) {
			swap(sb,start,end);
			start++;
			end--;
		}
		System.out.println(sb);
		sb.append(' ');
		start = 0;
		end = 0;
		while(end<sb.length()) {
			if(sb.charAt(end) == ' ') {
				
				int i = start;
				int j = end-1;
				while(i<j) {
					swap(sb,i,j);
					i++;
					j--;
				}
				
				//swap(sb,start,end-1);
				end++;
				start=end;
			}else {
				end++;
			}
		}
		
		System.out.println(sb);
		
		
		
	}

	private static void swap(StringBuilder sb,int i,int j) {

		char c2 = sb.charAt(j);
		char c1 = sb.charAt(i);
		sb.replace(i, i+1, c2+"");
		//System.out.println(sb);
		sb.replace(j, j+1, c1+"");
		//System.out.println(sb);
		
		
	}
	
	

}
