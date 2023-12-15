package week1.day2assignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n=393,rem,dup,r;
 dup=n;
 for (r=0;n>0;n=n/10) {
	 rem=n%10;
	 r=(r*10)+rem;
	
 }
if(r==dup) {
	 System.out.println(dup+" is a palindrome number");
 }
else {
	System.out.println(dup+" is not a palindrome number");
}
	}

}
