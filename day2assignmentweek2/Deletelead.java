package week2.day2assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deletelead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click Login Button
		driver.findElement(By.className("decorativeSubmit")).click();
		//click crmsfa link
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Sindhu");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).sendKeys("Sindhu");
		String text = driver.findElement(By.id("justanotherlink")).getText();
		
	}

}
