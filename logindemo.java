package wingify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class logindemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://sakshingp.github.io/assignment/login.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("Krushna");
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("123456789");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='log-in']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"amount\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"amount\"]")).click();
		Thread.sleep(3000);
		
		

}

}



