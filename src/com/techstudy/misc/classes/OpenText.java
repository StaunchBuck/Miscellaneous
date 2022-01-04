package com.techstudy.misc.classes;

public class OpenText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new OpenText().solution(28));
	}

	public int solution(int N) {
        //System.out.println(sum(N));
        int sum = sum(N);
        int res = 0;
       while(true){
           int temp = sum(++N);
           if(temp==sum){
               res = N;
               break;
           }
       }
       return res; 
    }

    private int sum(int i){
        int sum = 0;
        while(i>=10){
            sum +=i%10;
            i = i/10;
        }
        return sum+i;
    }
}
