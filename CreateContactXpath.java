package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactXpath {
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
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		String title1=driver.getTitle();
		System.out.println(title1);
		driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
	    driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Aravind");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Manoharan");
	    driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("Aarvi");
		driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("Kiddo");
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("Mechanical");
		driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("LotofEx's");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("aarvikiddo54@gmail.com");
		WebElement State=driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
		Select choose =new Select(State);
		choose.selectByValue("TX");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		WebElement description=driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']"));
		description.clear();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).sendKeys("Learning Xpath");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.getTitle();
		System.out.println("lead");

}
}