package Array;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
		
		int numbers[] = {1,2,3,4,5,6,7};
		
		
		// 1
		for(int i=0; i<numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}
		
		
		// 2
		//for each loop
		for(int i:numbers)
		{
			System.out.println(i);
		}
		
		
		// 3
		System.out.println(Arrays.toString(numbers));
	}
}
