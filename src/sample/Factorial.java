package sample;

public class Factorial {

	public static void main(String[] args) {
		
		// Create an auxiliary array
        // of twice size.
		int n = 17;
		int ind = 3;
        int[] b = new int[(2 * n)+1];
 
        // Copy a[] to b[] two times
        for (int i = 0; i <= n; i++)
            b[i] = b[n + i] = i;
 
        // print from ind-th index to
        // (n+i)th index.
        for (int i = ind; i <= n + ind; i++)
            System.out.print(b[i]+" ");

	}

}
