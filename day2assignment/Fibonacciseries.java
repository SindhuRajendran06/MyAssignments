package week1.day2assignment;

public class Fibonacciseries {

	public static void main(String[] args) {
		int range=8,firstNum=0,secnum=1,sum;
		System.out.println(firstNum);
		System.out.println(secnum);
		for(int i=3;i<=8;i++) {
			sum=firstNum+secnum;
			firstNum=secnum;
			secnum=sum;
			System.out.println(sum);
		}
	}

}
