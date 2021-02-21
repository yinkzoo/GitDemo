import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {
    public static void main(String[] args) {
        // write your code here
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://rediff.com");
        //tagName[attribute='value']  -CSS  tagName#id- CSS   tagname.classname- CSS
        driver.findElement(By.cssSelector("a[title*= 'Sign in']")).click();
        //tagName[contains(@attribute,'value')]  - xpath regular expression
        driver.findElement(By.xpath("//input[@id= 'login1']")).sendKeys("Hello");
        driver.findElement(By.xpath("//input[@type= 'password']")).sendKeys("welcome");
        driver.findElement(By.xpath("//input[contains(@name,'proceed')]")).click();

    }

}
