package sample;

import java.util.Set;
import java.util.TreeSet;

public class NextPermutation {

	public static void main(String[] args) {
		int[] arr = new int[] {2,3,4,1};  //2341
		int[] result = new NextPermutation().permute(arr);
		for(int i:result)
			System.out.print(i+" ");
	}
	
	
	public int[] permute(int[] arr) {
		
		Set<Integer> used = new TreeSet<>();
		Set<Integer> avail = new TreeSet<>();
		
		avail.add(arr[arr.length-1]);

		for (int i=0;i<arr.length-1;i++)
			used.add(arr[i]);
				
		int size = arr.length;
		
		
		for(int i =size-2;i>=0;i--){
			used.remove(arr[i]);
			avail.add(arr[i+1]);
			if(avail.size()>0 && (int)avail.toArray()[0]>arr[i]){
				int temp = arr[i];
				arr[i] = (int)avail.toArray()[0];
				avail.add(temp);
		
				int count = 0;
				for(int j=i+1;j<size;j++){
					arr[j] = (int)avail.toArray()[count];
					count++;
				}
				return arr;
		}else {

		}
	  }
		return arr;
	}
}
