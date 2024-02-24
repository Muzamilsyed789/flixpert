package Check;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Demo {
@Test
public void Agoda() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.agoda.com/?ds=tA9zos7Wrbq597Os");
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[contains(text(),'Take me')]/following-sibling::button[contains(text(),'No thanks')]"))));
	driver.findElement(By.xpath("//*[contains(text(),'Take me')]/following-sibling::button[contains(text(),'No thanks')]")).click();
	
//	driver.findElement(By.xpath("//input[@id='textInput']")).click();
//	driver.findElement(By.xpath("//div[@class='sc-hiSbYr daxpJ'")).click();
//	driver.findElement(By.xpath("//div[@class='SearchBoxTextDescription__title']")).click();
	
}
}
