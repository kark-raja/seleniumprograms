package automationFramework;

import org.testng.annotations.Test;
import org.openga.selenium.by;

public class NewTest {
	WebDriver driver;
  @Test
  public void a_pageLoad() {
	  System.setProperty("webdriver.chrome.driver","chromedriver");
	  driver=new ChromeDriver();
	  driver.get("http://www.saucedemo.com/");
	  driver.manage().window().maximize();
	  }
  @Test
  public void b_logIn() throws InterruptedException{
	  driver.findElement(By.id("user-name")).sendKeys("standard-user");
	  driver.findElement(By.name("password")).sendKeys("secret-sauce");
	  driver.findElement(By.xpath("//input[@id_'login-button']")).click();
	  Thread.sleep(5000);
  }
  public void c_logOut() throws InterruptedException{
	  driver.findElement(By.id("react-burger-menu-btn")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.id("logout_sidebar_link")).click();
}
}
