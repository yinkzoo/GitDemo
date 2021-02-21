import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class LiveDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        Thread.sleep(500);
        //click on column
        driver.findElement(By.xpath("//tr/th[1]")).click();
        //capture all web element into list
        List<WebElement>elementlist=driver.findElements(By.xpath("//tr/td[1]"));
        //capture text of all webelements int new original list
        List<String>originalList=elementlist.stream().map(s->s.getText()).collect(Collectors.toList());
        //sort on the original list to step 3-->sorted list
        List<String>sortedlist= originalList.stream().sorted().collect(Collectors.toList());
        //compare original list vs sorted list
        Assert.assertTrue(originalList.equals(sortedlist));
        //scan the name column with gettext-->bean to print the price of beans
        List<String> price;
        do {
            List<WebElement>rows=driver.findElements(By.xpath("//tr/td[1]"));
             price=rows.stream().filter(s -> s.getText().contains("Beans")).
                    map(s -> getPriceVeggie(s)).collect(Collectors.toList());
            price.forEach(a -> System.out.println(a));
            if (price.size() < 1) {
                driver.findElement(By.cssSelector("[aria-label='Next']")).click();
            }
        }while (price.size()<1);


    }

    private static String getPriceVeggie(WebElement s) {
        String priceValue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
        return priceValue;
    }
}
