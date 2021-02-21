import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

    public static void main(String[] args) {
        // write your code here

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        //System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //driver.get("http://yahoo.com");
        //driver.close();
        driver.get("http://facebook.com");
        driver.findElement(By.id("email")).sendKeys("yinkzoo@gmaill.com");
        driver.findElement(By.name("pass")).sendKeys("alexy2006");
        driver.findElement(By.linkText("Forgotten account?")).click();

    }

}
