package week2.day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbcreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//driver.findElement(By.xpath("//div[text()='First name']")).sendKeys("Sindhu");
		//driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Raj06");
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']")).sendKeys("12346789");
		driver.findElement(By.xpath("//div[text()='New password']")).sendKeys("Shahudi@sindhu");
		WebElement day = driver.findElement(By.id("day"));
		Select d = new Select(day);
		d.selectByValue("23");
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByValue("12");
		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByValue("1997");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
	}

}
