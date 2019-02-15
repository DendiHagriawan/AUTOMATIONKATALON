
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
driver.get('http://www.tiket.com');
System.out.println("*** Search Hotel ***");

String location = "Bandung";
driver.findElement(By.xpath("//*[@href='/hotel']")).click();
driver.findElement(By.xpath("//*[@class='select-box-input tix-text-black']")).sendKeys(location);
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@class='tix-text-light-blue'][text()='"+ location +"']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@class='tix-button-2 tix-font-medium tix-text-size-1'][text()='Cari Hotel']")).click();
driver.findElement(By.xpath("//*[@class='tix-column-nowrap f1']"));
 
//String popUp = driver.findElement(By.xpath("//*[@class='tix-button-2'][text()='Segera']")).getText();
//
//if(popUp.equals("Segera")){
//	driver.findElement(By.xpath("//*[@class='tix-button-2'][text()='Segera']")).click();
//	 
//}else{
//}
Thread.sleep(10000);
driver.findElement(By.xpath("//*[@class='  tix-text-size-125 tix-text-lh-15 tix-my-0 tix-pr-05 tix-ellipsis-1 tix-text-black tix-font-medium'][text()='The Trans Luxury Bandung']")).click();
driver.findElement(By.xpath("//*[text()='The Trans Luxury Bandung']"));
driver.findElement(By.xpath("(//button[@class='btn-book tix-button-2'])[1]")).click();
driver.findElement(By.xpath("(//i[@class='tixicon-down'])[1]")).click();
driver.findElement(By.xpath("(//button[@data-value='Mr'])[1]")).click();
driver.findElement(By.xpath("//input[@name='cp-name']")).sendKeys("Booking Testing");
driver.findElement(By.xpath("(//i[@class='tixicon-down'])[2]")).click();
driver.findElement(By.xpath("//input[@name='cp-phone']")).sendKeys("0856226125123");
driver.findElement(By.xpath("//input[@name='cp-email']")).sendKeys("harry.gumbilar@tiket.com");
driver.findElement(By.xpath("//textarea[@name='specialRequest']")).sendKeys("ini adalah kolom permintaan khusus");
driver.findElement(By.xpath("//button[@class='btn pull-right tix-button-2']"));
//driver.findElement(By.xpath("")); 
//driver.findElement(By.xpath(""));
//driver.findElement(By.xpath(""));
//driver.findElement(By.xpath(""));