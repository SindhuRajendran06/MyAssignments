package week3.day1assignment;

public class LoginPage extends BasePage {

	public void performCommonTasks() {
		 System.out.println("Perform common taks-> Login page subclass");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage l = new LoginPage();
		l.performCommonTasks();
		l.findElement();
		l.clickElement();
		l.enterText();
		
		BasePage b = new BasePage();
		b.performCommonTasks();
		
	}

}
