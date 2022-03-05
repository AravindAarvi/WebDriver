package webDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[]args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        String title0 = driver.getTitle();
        System.out.println(title0);
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        String title1 = driver.getTitle();
        System.out.println(title1);
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TL");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aarvi");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kiddo");
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Aravind");
        driver.findElement(By.name("departmentName")).sendKeys("Mech");
        driver.findElement(By.name("description")).sendKeys("LearningWebDriver");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aarvikiddo54@gmail.com");
        WebElement stateProvince=driver.findElement(By.name("generalStateProvinceGeoId"));
        Select choose=new Select(stateProvince);
        choose.selectByValue("TX");
        driver.findElement(By.className("smallSubmit")).click();
        String title2 = driver.getTitle();
        System.out.println(title2);
        driver.findElement(By.className("subMenuButton")).click();
        String title3 = driver.getTitle();
        System.out.println(title3);
        WebElement companyName=driver.findElement(By.id("createLeadForm_companyName"));
        companyName.clear();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Aarvi'sCafe");
        WebElement createLeadForm_firstName=driver.findElement(By.id("createLeadForm_firstName"));
        createLeadForm_firstName.clear();
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rv");
        driver.findElement(By.className("smallSubmit")).click();
        String title5 = driver.getTitle();
        System.out.println(title5);
	}
}

