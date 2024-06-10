package july2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class newxpth12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rediff.com");
		driver.findElement(By.linkText("Rediffmail")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Adithi");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Hello123");
		driver.findElement(By.xpath("//u[text()='Create a new account']")).click();
		//driver.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys("John");
		//driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("john123@rediff.com");
	driver.findElement(By.cssSelector("input[name*='name']")).sendKeys("abinav");
	driver.findElement(By.cssSelector("input[name*='login']")).sendKeys("abi123");
	driver.findElement(By.cssSelector("input[name*='btnchk'")).click();
	driver.findElement(By.xpath("(//input[@id='radio_button'])[20]")).click();
	Select s1=new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]")));
	s1.selectByIndex(07);
	Select s2=new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]")));
	s2.selectByIndex(02);
	Select s3=new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]")));
	s3.selectByValue("1986");
	
	}

}
