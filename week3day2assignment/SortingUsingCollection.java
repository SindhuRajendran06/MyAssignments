package week3.day2assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a= {"HCL","Wipro","Aspire Systems","CTS"};
		int l=a.length;
		System.out.println("The length of the array is "+l);
		List<String> c = new ArrayList<String>();
		for(int i=0;i<=l-1;i++) {
			c.add(a[i]);
		}
System.out.println(c);
Collections.sort(c);
System.out.println(c);
Collections.reverse(c);
System.out.println("The reversed order is "+c);
	}

}
