package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("https://en-gb.facebook.com/");
		 driver.manage().window().maximize();
		 driver.findElement((By.linkText("Create New Account"))).click();
		 Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("crmsfa");

			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("crmsfa");
			
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("991882993");

			driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Candy@123");
			
			WebElement element =driver.findElement(By.xpath("//select[@id='day']"));
			Select AA = new Select(element);
			AA.selectByVisibleText("4");
			
			WebElement element1 =driver.findElement(By.xpath("//select[@id='month']"));
			Select AA1 = new Select(element1);
			AA1.selectByVisibleText("Sep");
			
			WebElement element2 =driver.findElement(By.xpath("//select[@id='year']"));
			Select AA2 = new Select(element2);
			AA2.selectByVisibleText("1995");
			
			driver.findElement(By.xpath("//label[contains(text(),'Fema')]")).click();
			//Select AA2 = new Select(element2);
			//AA2.selectByVisibleText("1995");
			//driver.findElement(By.xpath("//input[@name='websubmit']")).click();
			


}
}