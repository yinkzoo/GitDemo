import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Miscelleanous {


    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://www.google.com");
        //how to take screenshot
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(src,new File("C:\\Users\\yinkz\\Screenshot.png"));

    }


}
