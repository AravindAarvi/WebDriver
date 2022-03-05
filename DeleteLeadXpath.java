package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLeadXpath {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    String title0=driver.getTitle();
		System.out.println(title0);
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8610976348");
	    driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
	    driver.findElement(By.xpath("//span[text()='Lead List']")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'10258')]")).click();
	    String title1=driver.getTitle();
	    System.out.println(title1);
        driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
        driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10258");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		String title2 =driver.getTitle();
		System.out.println(title2);
			
	}
}