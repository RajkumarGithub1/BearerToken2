package ideyaLabsTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativeXpathExamples 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.findElement(By.xpath("//input[@id='email']"));   //unique attribute
		driver.findElement(By.xpath("//button[@name='login']")); 
		driver.findElement(By.xpath("//a[@href='/reg/']"));
		//multiple attributes
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi' and @type='password']"));
	
		//text() function
		driver.findElement(By.xpath("//button[text()='Log In']"));
		
//		driver.findElement(By.xpath("//"
		
		
		//by group index 
		driver.findElement(By.xpath("(//div[@class='eFQ30H'])[1]"));
	}
}
