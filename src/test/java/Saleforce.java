
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saleforce {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.get("http://google.com");
        //System.out.println(driver.getTitle());
        //System.out.println(driver.getCurrentUrl());
        driver.get("https://login.salesforce.com/");
        //driver.close();
        //driver.get("http://facebook.com");
        driver.findElement(By.id("username")).sendKeys("yinkzoo@gmaill.com");
        driver.findElement(By.name("pw")).sendKeys("alexy2006");
        driver.findElement(By.className("button r4 wide primary?")).click();
    }

}
