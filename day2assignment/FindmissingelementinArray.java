package week1.day2assignment;

import java.util.Arrays;

public class FindmissingelementinArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		int length=arr.length;

		// Sort the array	
		Arrays.sort(arr);

		// loop through the array (start i from arr[0] till the length of the array)
      for (int i=1;i<length;i++)
      {
    	 if(arr[i-1]!=i) {
    		 System.out.println("Missing number is "+i);
    		 break;
    	 }
    	 
      }
			
				

	}

}
