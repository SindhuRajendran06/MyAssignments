package week3.day1assignment;

public class LoginTestData1 extends TestData{
	public void enterUsername() {
		System.out.println("Username entered -> logintest data1");
	}
	public void enterPassword() {
		System.out.println("Password entered -> logintest data1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData1 l1=new LoginTestData1();
		l1.enterCredentials();
		l1.navigateToHomePage();
		l1.enterUsername();
		l1.enterPassword();
	}

}