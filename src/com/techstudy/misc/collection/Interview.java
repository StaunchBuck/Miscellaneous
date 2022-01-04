package com.techstudy.misc.collection;

public class Interview {

	public static void main(String[] args) {
		try {
			System.out.println("from try");
			//throw new Error();
			//System.exit(1);
			
			int x=0;
			int y=0;
			for(int z=0;z<5;z++) {
				if((++x > 2)||(++y >2)) {
					x++;
				}
			}
			System.out.println(x+" "+y);
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			System.out.println("from finally");
		}

	}

}
