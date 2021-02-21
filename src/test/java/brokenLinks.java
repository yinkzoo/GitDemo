import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class brokenLinks {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //step1-get allURL tied to the link using selenium
        //java methods to call URL`sand get the status
        //if status code is greater than 400 URL is not working i.e link is broken.

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
       List <WebElement> links= (List<WebElement>) driver.findElement(By.cssSelector("li[class='gf-li'] a"));
        SoftAssert a = new SoftAssert();
        for (WebElement link: links)
        {
            String url=link.getAttribute("href");
            HttpURLConnection conn =(HttpURLConnection)new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int respCode=conn.getResponseCode();
            System.out.println(respCode);
            a.assertTrue(respCode>400,"This link with text"+link.getText()+"is broken with code"+respCode);
            /*if(respCode>400)
            {
                System.out.println("This link with text"+link.getText()+"is broken with code"+respCode);
                Assert.assertTrue(false);

            }*/
        }
        a.assertAll();

        /*String url=driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
        HttpURLConnection conn =(HttpURLConnection)new URL(url).openConnection();
        conn.setRequestMethod("HEAD");
        conn.connect();
        int respCode=conn.getResponseCode();
        System.out.println(respCode);*/

    }
}
