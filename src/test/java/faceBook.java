import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class faceBook {
    public static void main(String[] args) {
        // write your code here

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("yinkzoo@gmail.com");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Alexy2006");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
}
