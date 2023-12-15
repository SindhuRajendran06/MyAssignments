package week1.day2assignment;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=17,r;
		boolean flag=false;
		for(int i=2;i<=n/2;i++) {
			r=n%i;
			if(r==0) {
				System.out.println("It is not a prime number");
				flag=true;
				break;
			}
		}if(flag==false) {
			System.out.println("it is a prime number");
		}

	}

}
