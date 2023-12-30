package week2.day2assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[@class='grid formgrid']//div)[4]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')]/following::h5[text()='Notification']/following::span)[2]")).click();
		driver.findElement(By.xpath("//h5[text()='Choose your favorite language(s)']/following::div[contains(@class,'ui-chkbox-box ui-widget')]")).click();
		driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following::div[contains(@class,'ui-chkbox-box ui-widget')]")).click();
		driver.findElement(By.xpath("//h5[text()='Toggle Switch']/following::div[@class='ui-toggleswitch-slider']")).click();
		WebElement multiple = driver.findElement(By.xpath("//h5[text()='Select Multiple']/following::div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']"));
		Select mul = new Select(multiple);
		mul.selectByVisibleText("Paris");
		
	}

}
