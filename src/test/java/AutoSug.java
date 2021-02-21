import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSug {
    public static void main(String[] args) throws InterruptedException {
        // write your code here

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        Thread.sleep(2000);
        WebElement source=driver.findElement(By.cssSelector("#fromCity"));
        source.click();
        source.sendKeys("MUM");
        source.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        source.sendKeys(Keys.ENTER);


       /* WebElement destination=driver.findElement(By.id("toCity"));
        destination.click();
        destination.sendKeys("Del");
        destination.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        destination.sendKeys(Keys.ENTER);*/





    }


}
