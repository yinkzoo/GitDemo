import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTests {

    public static void main(String[] args) throws InterruptedException {
        // write your code here

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        //tagName[@attribute='value']
        Thread.sleep(2000l);
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();



    }

}
