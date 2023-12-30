package week3.day2assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.ajio.com/");
			driver.manage().window().maximize();
			driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
			//driver.findElement(By.id("Men")).click();
			Thread.sleep(2000);
			// To the left  of the screen under " Gender" click the "Men"
			driver.findElement(By.xpath("//label[@for='Men']")).click();
			Thread.sleep(2000);
			//Under "Category" click "Fashion Bags"
			driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
			Thread.sleep(2000);
			// Print the count of the items Found.
			String totalItems = driver.findElement(By.className("length")).getText();
			System.out.println("Total number of items : " + totalItems);
			//Get the list of brand of the products displayed in the page and print the list.
			System.out.println(" List of Brands");
			List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
			System.out.println(" Size :" + bagBrandList.size());

			for (WebElement webElement : bagBrandList) {
				String text = webElement.getText();
				System.out.println(text);
			}
			// Get the list of names of the bags and print it
			List<WebElement> bagNameList = driver.findElements(By.className("nameCls"));
			System.out.println(" Size :" + bagNameList.size());
			System.out.println(" Names of the Bags");
			for (WebElement each : bagNameList) {
				String text = each.getText();
				System.out.println(text);
			}

		}
	}

