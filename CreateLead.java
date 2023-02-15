package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	private static final Duration Duration = null;

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karikalan");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Venkatachalam");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Test");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("EEE");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Electricals");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Karikalan.online@gmail.com");
		
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateDropdown = new Select(state);
		stateDropdown.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		




	}

}
