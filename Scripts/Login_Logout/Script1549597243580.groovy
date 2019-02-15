import java.io.IOException as IOException
import java.util.concurrent.TimeUnit as TimeUnit
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.By as By
import org.openqa.selenium.By.ByXPath as ByXPath
import org.openqa.selenium.WebDriver as WebDriver


System.setProperty('webdriver.chrome.driver', '/Users/harrygumbilar/Documents/TestingWEBAutomation/src/Dependency/chromedriver')

ChromeDriver driver = new ChromeDriver()

System.out.println('*** login ***')

driver.get('https://www.tiket.com')

driver.findElement(By.xpath('//*[@class=\'login-btn\']')).click()

//new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Log In ke tiket.com']")));
driver.findElement(By.xpath('//*[text()=\'Log In ke tiket.com\']'))

driver.findElement(By.xpath('//*[@ class=\'form-control mtr-input\'][@name=\'email\']'))

driver.findElement(By.xpath('//*[@ class=\'form-control mtr-input\'][@name=\'email\']')).sendKeys('harry.gumbilar@tiket.com')

driver.findElement(By.xpath('//*[@ class=\'form-control mtr-input\'][@name=\'password\']')).sendKeys('Annis@171925')

driver.findElement(By.xpath('//*[@id=\'js-btn-login\']'))

driver.findElement(By.xpath('//*[@id=\'js-btn-login\']')).click()

driver.findElement(By.xpath('//*[text()=\'Harry\']'))

driver.findElement(By.xpath('//*[@class=\'tixicon-down\']')).click()

driver.findElement(By.xpath('//*[@data-value=\'logout\']'))

driver.findElement(By.xpath('//*[@data-value=\'logout\']')).click()

driver.findElement(By.xpath('//*[@href=\'/login\']'))

Thread.sleep(5000)

driver.close()

