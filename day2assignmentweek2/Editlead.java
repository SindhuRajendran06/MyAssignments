package week2.day2assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Editlead {

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
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[contains(@id,'companyName')]")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//span[text()='First name']/following::input)[1]")).sendKeys("Sindhu");
		driver.findElement(By.xpath("(//span[text()='Last name']/following::input)[1]")).sendKeys("raje");
		driver.findElement(By.xpath("(//span[text()='First Name (Local)']/following::input)[1]")).sendKeys("Samsindhu");
		driver.findElement(By.xpath("(//span[text()='Department']/following::input)[1]")).sendKeys("Testing");
		driver.findElement(By.name("description")).sendKeys("abcdefgh");
		driver.findElement(By.name("primaryEmail")).sendKeys("shahidhdesdfre@gmail.com");
		WebElement state = driver.findElement(By.xpath("(//span[text()='State/Province']/following::select)[1]"));
		Select s = new Select(state);
		s.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		WebElement des=driver.findElement(By.name("description"));
		des.clear();
		driver.findElement(By.xpath("//span[text()='Important Note']/following::textarea")).sendKeys("Please check the credentials");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();




	}

}
