import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fireFox {
    public static void main(String[] args) {
        // write your code here
        System.setProperty("webdriver.gecko.driver","C:\\Program Files (x86)\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://facebook.com");
        //System.out.println(driver.getTitle());
        driver.findElement(By.cssSelector("#email")).sendKeys("yinkzoo@gmail.com");
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Alexy2006");



    }

}
