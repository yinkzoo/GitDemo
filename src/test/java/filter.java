import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class filter {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        Thread.sleep(500);
        driver.findElement(By.id("search-field")).sendKeys("Rice");
        List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]"));
        List filterList=veggies.stream().filter(Veggies->Veggies.getText().contains("Rice")).
                collect(Collectors.toList());
        Assert.assertEquals(veggies.size(),filterList.size());
    }
}
