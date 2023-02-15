package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Test");
		
		driver.findElement(By.name("lastname")).sendKeys("Leaf");
		
		driver.findElement(By.name("reg_email__")).sendKeys("9944701533");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("Test");
		
		WebElement dropdown1 = driver.findElement(By.id("day"));
		Select day = new Select(dropdown1);
		day.selectByVisibleText("1");
		
		WebElement dropdown2 = driver.findElement(By.id("month"));
		Select month = new Select(dropdown2);
		month.selectByVisibleText("Jan");
		
		WebElement dropdown3 = driver.findElement(By.id("year"));
		Select year = new Select(dropdown3);
		year.selectByVisibleText("2023");
		
		driver.findElement(By.className("_8esa")).click();
		
		
		
		
		
		
		
	}

}
