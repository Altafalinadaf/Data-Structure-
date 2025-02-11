package arrays;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int arr[]= {2,1,4,52,1,4,52,45,34,34,54};
		Arrays.sort(arr);
		System.out.println("arrays are sorted");
		
		for(int ele:arr) {
			System.out.println(ele);
		}
	}
}
