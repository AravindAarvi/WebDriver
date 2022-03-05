package xpath;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class FacebookXpath {

	public static void main(String[] args)  {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Aarvi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kiddo");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8610976348");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Aravind@98");
		WebElement days = driver.findElement(By.xpath("//select[@id='day']"));
		Select birthday = new Select(days);
		birthday.selectByVisibleText("17");
		WebElement yourmonth = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(yourmonth);
		month.selectByVisibleText("Feb");
		WebElement correctyear = driver.findElement(By.xpath("//select[@id='year']"));
		Select year = new Select(correctyear);
		year.selectByVisibleText("1998");
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();

}
}
