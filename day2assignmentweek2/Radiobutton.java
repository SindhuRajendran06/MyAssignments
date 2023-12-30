package week2.day2assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//h5[text()='Your most favorite browser']/preceding::label[text()='Edge']/preceding::span")).click();
		
		
	}

}
