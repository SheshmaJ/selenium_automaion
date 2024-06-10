package july2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class redif12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rediff.com");
		driver.findElement(By.linkText("Rediffmail")).click();
		driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("Mahik");
		driver.findElement(By.cssSelector("input#login1")).sendKeys("Mahik");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Hello123");
		driver.findElement(By.name("passwd")).sendKeys("Hello123");
		driver.findElement(By.linkText("Create a new account")).click();
		driver.findElement(By.xpath("//input[starts-with(@name,'name')")).sendKeys("indu");
		driver.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys("indu");
	
	
	
	}

}
