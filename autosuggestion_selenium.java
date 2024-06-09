package sheshu2023;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosugg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("comp");
		for(int i=0;i<7;i++);
		{
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.ARROW_DOWN);
		}
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.ENTER);
				
	}

}
