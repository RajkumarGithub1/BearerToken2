package ideyaLabsTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/tool-tips/");
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//button[@id='toolTipButton']"));
		
		Actions ac=new Actions(driver);
		ac.moveToElement(ele);
		
	}
}
