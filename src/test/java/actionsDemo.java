import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://amazon.com");
        Actions a=new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]")))
                .build().perform();
        a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click()
                .keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick().build().perform();


    }
}
