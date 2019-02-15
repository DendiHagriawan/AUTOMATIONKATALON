
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath
import org.openqa.selenium.WebDriver;


System.setProperty("webdriver.chrome.driver", "/Users/harrygumbilar/Documents/TestingWEBAutomation/src/Dependency/chromedriver");
ChromeDriver driver = new ChromeDriver();
//wd.manage().window().maximize();
//wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//login
System.out.println("*** login ***");
driver.get("https://www.tiket.com");
driver.findElement(By.xpath("//*[@href='/pesawat']"));
driver.findElement(By.xpath("//*[@href='/pesawat']")).click();

Thread.sleep(5000); 

driver.close();