import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Tests {
    public static void main(String[] args) throws InterruptedException {
        // write your code here

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //tagName[attribute='value']

        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected();
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

        {

            System.out.println("its enabled");

            Assert.assertTrue(false);

        }

        else

        {

            Assert.assertTrue(true);

        }

        //COUNT CHECKBOX
        System.out.println(driver.findElement(By.cssSelector("input[Type='checkbox']")).getSize());
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000l);
        /*int i=1;
        while (i<5)
        {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }*/
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        for (int i=1;i<5;i++)
        {
            driver.findElement(By.id("hrefIncAdt")).click();
        }

        Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
        s.selectByVisibleText("AED");
    }
}
