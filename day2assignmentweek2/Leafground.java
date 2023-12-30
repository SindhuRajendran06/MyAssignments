package week2.day2assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.Rectangle;

public class Leafground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		/*driver.findElement(By.xpath("//h5[text()='Click and Confirm title.']/following::span[text()='Click']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Dashboard")) {
			System.out.println("Title is displayed as Dashboard");
		}
	}
}*/
		boolean value = driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']/following::span[text()='Disabled']")).isEnabled();
		System.out.println(value);
		Rectangle res =  driver.findElement(By.xpath("(//h5[text()='Find the position of the Submit button']/following::span[text()='Submit'])[1]")).getRect();

		// Rectangle class provides getX,getY, getWidth, getHeight methods
		System.out.println(res.getX());
		System.out.println(res.getY());
		System.out.println(res.getWidth());
		System.out.println(res.getHeight());
		
		String cssValue = driver.findElement(By.xpath("//h5[text()='Find the Save button color']")).getCssValue("background-color");
		System.out.println(cssValue);
		Rectangle res1 =  driver.findElement(By.xpath("//h5[text()='Find the height and width of this button']")).getRect();
		System.out.println(res1.getWidth());
		System.out.println(res1.getHeight());
		driver.close();
	}

}
