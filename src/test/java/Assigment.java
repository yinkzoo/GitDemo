import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assigment {
    public static void main(String[] args) throws InterruptedException {
        // write your code here

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
        System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
        driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
        Thread.sleep(3000l);
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
        System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
        Thread.sleep(2000l);
        System.out.println(driver.findElement(By.cssSelector("input[Type='checkbox']")).getSize());





    }
}
