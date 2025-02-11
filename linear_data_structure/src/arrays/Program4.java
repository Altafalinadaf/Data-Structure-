package arrays;

import java.util.Arrays;

public class Program4 {
	public static void main(String[] args) {
		String fruit[]= {"banana","apple","waterlemon","feru","graps","orange"};
		
		Arrays.sort(fruit);
//		for(String n:fruit) {
//			System.out.println(n);
//		}
		
		// Arrray.toString(array_name) 
		// this is will return the sorted array 
		// no need for the for loop
		System.out.println(Arrays.toString(fruit));
	}

}
