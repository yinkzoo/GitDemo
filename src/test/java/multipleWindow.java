import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class multipleWindow {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup");
        driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[1]/p/a")).click();
        System.out.println("Before Switching");
        System.out.println(driver.getTitle());
        Set<String > Ids=driver.getWindowHandles();
        Iterator<String>it=Ids.iterator();
        String parentid=it.next();
        String childid=it.next();
        driver.switchTo().window(childid);
        System.out.println("After Switching");
        System.out.println(driver.getTitle());

        driver.switchTo().window(parentid);
        System.out.println(" Switching back to parents");
        System.out.println(driver.getTitle());

    }
}
