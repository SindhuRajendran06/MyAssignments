package week3.day1assignment;

public class LoginTestData extends TestData{
	public void enterUsername() {
		System.out.println("Username entered -> logintest data");
	}
	public void enterPassword() {
		System.out.println("Password entered -> logintest data");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData l=new LoginTestData();
		l.enterCredentials();
		l.navigateToHomePage();
		l.enterUsername();
		l.enterPassword();
	}

}
